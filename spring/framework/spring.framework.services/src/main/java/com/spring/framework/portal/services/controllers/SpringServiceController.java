package com.spring.framework.portal.services.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/02/08 0008.
 */
@Controller
@RequestMapping("/spring")
public class SpringServiceController {

    @ResponseBody
    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public void consolelog(HttpServletRequest request,
                           HttpServletResponse response){
        System.out.println("lalalla");
    }
}
