package com.zk.springboot.Exception;

import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author zpf
 * @date 2019/1/4 15:05
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler({TypeMismatchException.class, NumberFormatException.class,NullPointerException.class})
    public ModelAndView formatErrorHandler(HttpServletRequest req, Exception e) throws Exception {



        ModelAndView mav = new ModelAndView();
        mav.addObject("error", "参数类型错误");
        mav.addObject("exception", e.getMessage());
        mav.addObject("url", req.getRequestURL());
        mav.addObject("timestamp", new Date());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}
