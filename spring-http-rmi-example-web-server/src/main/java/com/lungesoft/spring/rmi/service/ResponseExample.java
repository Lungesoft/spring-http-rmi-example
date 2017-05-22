package com.lungesoft.spring.rmi.service;

import java.io.Serializable;

public class ResponseExample implements Serializable {

    private String text;

    public ResponseExample() {
    }

    public ResponseExample(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
