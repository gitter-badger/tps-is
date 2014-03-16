package com.is.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

/**
 * Created by Malek on 16/03/14.
 */
@Controller
@Scope("session")
public class TestController implements Serializable {


    @RequestMapping(value = "/test.do")
    public
    @ResponseBody
    String affiche() {
        return "hiiii ";
    }
}
