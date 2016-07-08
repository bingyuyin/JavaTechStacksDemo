package com.suiyu.springboot.demo.parent.controller.impl;

import com.suiyu.springboot.demo.parent.common.SampleResponseDetails;
import com.suiyu.springboot.demo.parent.controller.SampleController;
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
public class SampleControllerImpl implements SampleController {
    @Override
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> hello() {
        SampleResponseDetails responseDetails = new SampleResponseDetails();
        responseDetails.setTitle("Response title");
        responseDetails.setMessage("Hello world!");
        return new ResponseEntity<Object>(responseDetails, HttpStatus.OK);
    }
}
