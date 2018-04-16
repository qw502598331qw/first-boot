package exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
@ControllerAdvice
public class MyControllerAdvice {
//    全局捕获异常
    @ResponseBody
    @ExceptionHandler(value=Exception.class)
    public Map<String,Object>errorHandler(Exception ex){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code",-1);
        map.put("msg",ex.getMessage());
        return  map;
    }
    @ResponseBody
    @ExceptionHandler(value=BusinessException.class)
    public Map<String,Object>errorHandler(BusinessException ex){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code",ex.getCode());
        map.put("msg",ex.getMsg());
        return  map;
    }

}
