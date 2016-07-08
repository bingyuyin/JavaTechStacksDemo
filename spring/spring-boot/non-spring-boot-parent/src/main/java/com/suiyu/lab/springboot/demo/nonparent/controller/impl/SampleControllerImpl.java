package com.suiyu.lab.springboot.demo.nonparent.controller.impl;

import com.suiyu.lab.springboot.demo.nonparent.common.SampleResponseDetails;
import com.suiyu.lab.springboot.demo.nonparent.controller.SampleController;
import org.springframework.http.HttpStatus;
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
public class SampleControllerImpl implements SampleController{
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> hello() {
        SampleResponseDetails responseDetails = new SampleResponseDetails();
        responseDetails.setTitle("Response Title");
        responseDetails.setMessage("Hello World!");
        return new ResponseEntity<Object>(responseDetails, HttpStatus.OK);
    }
}
