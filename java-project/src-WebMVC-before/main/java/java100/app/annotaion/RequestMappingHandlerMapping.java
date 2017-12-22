package java100.app.annotaion;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.reflections.ReflectionUtils.*;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

public class RequestMappingHandlerMapping {

    Map<String, RequestHandler> handlerMap = new HashMap<>();
    
    public static class RequestHandler{
        
        public Object instance;
        public Method method;
        
        public RequestHandler(Object instance, Method method) {
            this.instance = instance;
            this.method = method;
        }
    }
    
    public RequestMappingHandlerMapping(ApplicationContext iocContainer) {
        // 스프링 IoC에서 @Controller 가 표시된 객체를 추출한다.
        
        String[] controllerNames = iocContainer.getBeanNamesForAnnotation(Controller.class);
        
        for(String controllerName : controllerNames) {
            Object controller = iocContainer.getBean(controllerName);
           
        @SuppressWarnings("unchecked")
        Set<Method> methods = getMethods(controller.getClass(), withAnnotation(RequestMapping.class));
          
           for(Method m : methods) {
               RequestMapping anno = m.getAnnotation(RequestMapping.class);
               
               // @RequestMapping 애노테이션 정보를 추출한다.
               RequestHandler handler = new RequestHandler(controller, m);
           
               handlerMap.put(anno.value(), handler);
           }
           
        }
        
        
    }
    
    public RequestHandler getRequestHandler(String name) {
        
        return handlerMap.get(name);
        
    }
    
}
