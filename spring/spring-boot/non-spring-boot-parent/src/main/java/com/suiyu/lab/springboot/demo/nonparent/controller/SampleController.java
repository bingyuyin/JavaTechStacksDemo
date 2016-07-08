package com.suiyu.lab.springboot.demo.nonparent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yinbing on 7/8/2016.
 */
@Controller
@RequestMapping("/rest/sample")
public interface SampleController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    ResponseEntity<Object> hello();
}
