package exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
@ControllerAdvice
public class MyControllerAdvice {
    @ResponseBody
    @ExceptionHandler(value=Exception.class)
    public Map<String,Object>errorHandler(Exception ex){
        Map<String,Object>map=new HashMap<>();
        map.put("code",-1);
        map.put("masg",ex.getMessage());
        return  map;
    }
}
