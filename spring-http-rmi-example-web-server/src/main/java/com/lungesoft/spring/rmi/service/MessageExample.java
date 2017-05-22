package com.lungesoft.spring.rmi.service;

import java.io.Serializable;

public class MessageExample implements Serializable {

    private String text;

    public MessageExample() {
    }

    public MessageExample(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
