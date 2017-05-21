package com.lungesoft.spring.rmi.service.impl;

import com.lungesoft.spring.rmi.service.MessageExample;
import com.lungesoft.spring.rmi.service.ResponseExample;
import com.lungesoft.spring.rmi.service.ServiceExample;

public class ServiceExampleImpl implements ServiceExample {

    public ResponseExample sayHello(MessageExample message) {
        String messageText = message.getText();
        System.out.println("sayHello() is called, message text: " + messageText);
        return new ResponseExample("Hello from server, your message:  " + messageText);
    }

}
