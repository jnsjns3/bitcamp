package myTest3;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import java100.app.annotation.Component;

public class ApplicationContext {

    String baseDir;
    int startIndexOfPackageName;
    
    HashMap<String, Object> pool = 
            new HashMap<>();

    public ApplicationContext() {}
    
    public static void main(String[] args) {
        new ApplicationContext("./bin");
        
        
        
    }
    
    public ApplicationContext(String classPath) {
       
       File dir = new File(classPath);
       
       if(!dir.isDirectory())
           return;
           
        
        try{
            ArrayList<String> classnames = new ArrayList<>();
            this.baseDir =  dir.getCanonicalPath();
            this.startIndexOfPackageName = baseDir.length() + 1;
            this.findClassFile(classnames, dir);
            
            
         
            for(String classname : classnames) {
               Class<?> clazz = Class.forName(classname);
            
               Component compAnno = clazz.getAnnotation(Component.class);
               if(compAnno == null) continue;
               
               
               Object obj = clazz.newInstance();
               if(compAnno.value().length() == 0) {
                   pool.put(clazz.getName(), obj); 
               }else {
                   pool.put(compAnno.value(), obj);
               }
                   
               
               
            }
            
            
            injectDependency();
            
        } catch (Exception e) {
            throw new BeansException("프로퍼티  파일 로딩중 오류발생", e);
        }
        
       
    }
    
    private void findClassFile(List<String> classnames, File dir) throws Exception {
        
       File[] files =dir.listFiles(new FileFilter() {

        @Override
        public boolean accept(File pathname) {
                if(pathname.isFile() && !pathname.getName().endsWith(".class")) 
                    return false;
        return true;
        }
       });
       
       for(File f : files) {
           if(f.isDirectory()) {
               findClassFile(classnames, f);
           }else {
               classnames.add(f.getCanonicalPath().substring(this.startIndexOfPackageName).replace("\\", ".").replaceAll(".class", ""));
           }
       }
       
       
    }
    
    public Object getBean(String name) {
        Object bean =pool.get(name);
        if(bean == null)
            throw new BeansException("빈을 찾을 수 없습니다.");
        return bean;
    }
    
    public void addBean(String name, Object bean) {
        pool.put(name, bean);
        
    }
    
    public String[] getBeanDefinitionNames() {
       Set<String> keySet = pool.keySet();
       String[] names = new String[keySet.size()];
       
      keySet.toArray(names);
      
      return names; 
    
    }
    
    private void injectDependency() {
       Collection<Object> objs = pool.values();
       for(Object obj : objs) {
           //System.out.println(obj.getClass().getName());
           
          invokeSetter(obj);
       }
       
    }
    
    
    private void invokeSetter(Object obj) {
        
        Method[] methods =obj.getClass().getDeclaredMethods();
        for(Method m : methods) {
            if(!m.getName().startsWith("set")) continue;
                //System.out.println("=> "+m.getName());
                
                //System.out.println("    - "+ paramType.getName());
                
                Object dependency = findObject(getFirstPrameterType(m));
                if(dependency == null) continue; 
                
                    try {
                     m.invoke(obj, dependency);
                     //System.out.printf("%s.%s() 호출됨!\n", obj.getClass().getName(),
                      //                                      m.getName()
                      //                                     );
                 } catch (Exception e) {
                     throw new BeansException(obj.getClass().getName() + " 클래스의 "+ m.getName() + " 메서드 호출 오류!");
                 }
                    
             
        }
        
    }
    
    private Class<?> getFirstPrameterType(Method m){
        return m.getParameterTypes()[0];
    }
    
    private Object findObject(Class<?> type) {
        
       Collection<Object> objs = pool.values();
        for(Object obj : objs) {
            if(type.isInstance(obj)) {
                return obj;
            }
        
        }
        return null;
    }
    
    public void refreshBeanFactory() {
        injectDependency();
    }
    
}