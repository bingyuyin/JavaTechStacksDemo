package com.suiyu.springboot.demo.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yinbing on 7/8/2016.
 */
@ComponentScan
@EnableAutoConfiguration
public class SampleSpringBootApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SampleSpringBootApplication.class, args);
    }
}
