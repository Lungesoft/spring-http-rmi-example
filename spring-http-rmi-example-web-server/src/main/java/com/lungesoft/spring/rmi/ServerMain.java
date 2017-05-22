package com.lungesoft.spring.rmi;

import com.lungesoft.spring.rmi.service.ServiceExample;
import com.lungesoft.spring.rmi.service.impl.ServiceExampleImpl;
import com.sun.net.httpserver.HttpHandler;
import org.springframework.remoting.httpinvoker.SimpleHttpInvokerServiceExporter;
import org.springframework.remoting.support.SimpleHttpServerFactoryBean;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        SimpleHttpInvokerServiceExporter serviceExporter = new SimpleHttpInvokerServiceExporter();
        serviceExporter.setService(new ServiceExampleImpl());
        serviceExporter.setServiceInterface(ServiceExample.class);
        serviceExporter.afterPropertiesSet();

        SimpleHttpServerFactoryBean simpleHttpServerFactoryBean = new SimpleHttpServerFactoryBean();
        Map<String, HttpHandler> contexts = new HashMap<>();
        contexts.put("/example", serviceExporter);
        simpleHttpServerFactoryBean.setContexts(contexts);
        simpleHttpServerFactoryBean.setPort(9080);
        simpleHttpServerFactoryBean.afterPropertiesSet();
    }
}