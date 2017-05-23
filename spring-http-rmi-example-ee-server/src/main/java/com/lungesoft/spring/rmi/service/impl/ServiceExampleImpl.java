package com.lungesoft.spring.rmi.service.impl;

import com.lungesoft.spring.rmi.service.MessageExample;
import com.lungesoft.spring.rmi.service.ResponseExample;
import com.lungesoft.spring.rmi.service.ServiceExample;

import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless(name = "ServiceExampleImpl")
public class ServiceExampleImpl implements ServiceExample, Serializable{

    public ResponseExample sayHello(MessageExample message) {
        String messageText = message.getText();
        System.out.println("sayHello() is called, message text: " + messageText);
        return new ResponseExample("Hello from server, your message:  " + messageText);
    }

}
