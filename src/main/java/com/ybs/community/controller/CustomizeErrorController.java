package com.ybs.community.controller;

import com.ybs.community.exception.CustomizeException;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

/**
 * CustomizeErrorController
 *
 * @author Paulson
 * @date 2020/2/18 0:45
 */

@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class CustomizeErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "error";
    }


    @RequestMapping(produces = MediaType.TEXT_HTML_VALUE)
    ModelAndView handle(HttpServletRequest request, Model model) {

        HttpStatus status = getStatus(request);
        if (status.is4xxClientError()){
            model.addAttribute("message", "404错误， 请求错误");
        }

        if (status.is5xxServerError()){
            model.addAttribute("message", "500错误，服务器冒烟");
        }
        return new ModelAndView("error");
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
