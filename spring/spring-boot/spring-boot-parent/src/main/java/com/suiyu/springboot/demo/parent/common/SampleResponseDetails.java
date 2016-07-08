package com.suiyu.springboot.demo.parent.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yinbing on 7/8/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SampleResponseDetails {
    private String title;
    private String message;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
