package java100.app.servlet;

import static org.reflections.ReflectionUtils.*;
import static org.reflections.ReflectionUtils.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java100.app.annotaion.RequestMapping;
import java100.app.annotaion.RequestMappingHandlerMapping.RequestHandler;
import java100.app.annotaion.RequestParam;
import java100.app.listener.ContextLoaderListener;

// 프론트 컨트롤러
// - 페이지 컨트롤러의 앞 쪽에서 요청을 먼저 받는다.
// - 페이지 컨트롤러가 사용하기 쉽게 요청 데이터를 가공한다.
// - 페이지 컨트롤러가 작업을 완료하면 그 작업 결과를 출력할 JSP를 실행한다.
// - 또는 Redirect 시킨다.

@WebServlet("*.do")
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet{

    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String servletPath = request.getServletPath().replace(".do", "");
        
         
         RequestHandler requestHandler = ContextLoaderListener.handlermapping.getRequestHandler(servletPath);
         
         if(requestHandler == null) {
             throw new ServletException("요청 핸들러를 찾을 수 없습니다.");
         }
         
        
         Object[] paramValues = getParamValuesFor(requestHandler.method, request, response);
             
         try {
             String viewName = (String) requestHandler.method.invoke(requestHandler.instance, paramValues);
             
             if(viewName.startsWith("redirect:")) {
                response.sendRedirect(viewName.substring(9));
                return;
             }else {
                response.setContentType("text/html;charset=UTF-8");
                RequestDispatcher rd = request.getRequestDispatcher(viewName);
                rd.include(request, response);
             }
             
             }catch (Exception e) {
                 throw new ServletException(e);
             }
                
    }

    private Object[] getParamValuesFor(Method method, HttpServletRequest request, HttpServletResponse response) {
        
        Parameter[] params =method.getParameters();
        Object[] values = new Object[params.length];
        
        for(int i=0; i < params.length; i++) {
            if(params[i].getType() == HttpServletRequest.class) {
                values[i] = request;
            }else if(params[i].getType() == HttpServletResponse.class){
                values[i] = response;
            }else {
                // 파라미터에 붙인 @RequestParam 정보를 가져온다.
                RequestParam anno =params[i].getAnnotation(RequestParam.class);
                
                if(anno != null) {
                   
                String value = request.getParameter(anno.value());
                values[i] = toParamTypeValue(params[i] ,value);
                
                }else {
                  values[i] = toParamTypeObject(params[i], request);
                }
            
        }
        
        }
        return values;
    }
    
    private Object toParamTypeObject(Parameter parameter, HttpServletRequest request) {
       
        Class<?> clazz = parameter.getType();
        
        try {
                Object obj =clazz.newInstance();
                
            @SuppressWarnings("unchecked")
            Set<Method> setters = getMethods(clazz, withPrefix("set"), withParametersCount(1)); // set메소드중 값을 1개만 갖는것 추출
                
            for(Method setter : setters) {
                String name = setter.getName().replaceAll("set", "");
                String propName = getPropertyName(setter);
                String value = request.getParameter(propName);
                if (value == null) continue;
                
                Parameter param = setter.getParameters()[0]; // set메소드중 값을 1개만 갖는것 추출
                Object paramValue = toParamTypeValue(param, value);
                
                if(paramValue == null) continue; //String 값을 셋터가 원하는 타입의 값으로 바꾸지 못햇으면 셋터를 호출하지 않는다.
                
                setter.invoke(obj, paramValue);
            }
            
                return obj;
            
            } catch (Exception e) {
                return null;
            }
        
        
    }

    private String getPropertyName(Method method) {
        
        String name = method.getName().replaceAll("set", "");
        return String.format("%c%s", Character.toLowerCase(name.charAt(0)), name.substring(1));
        
    }
    
    private Object toParamTypeValue(Parameter param, String value) {
     
        Class<?> type = param.getType();
        
        if(type == byte.class) {
            return Byte.parseByte(value);
            
        } else if(type == short.class) {
            return Short.parseShort(value);
            
        } else if(type == short.class) {
            return Short.parseShort(value);
            
        }else if(type == int.class) {
            return Integer.parseInt(value);
            
        }else if(type == long.class) {
            return Long.parseLong(value);
            
        }else if(type == double.class) {
            return Double.parseDouble(value);
            
        }else if(type == boolean.class) {
            return Boolean.parseBoolean(value);
            
        }else if(type == float.class) {
            return Float.parseFloat(value);
            
        }else if(type == char.class) {
            return value.charAt(0);
            
        }else if(type == String.class) {
            return value;
            
        }else {
            return null;
        }
        
    }
    
    }

    

