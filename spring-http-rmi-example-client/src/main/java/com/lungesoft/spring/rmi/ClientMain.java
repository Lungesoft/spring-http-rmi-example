package com.lungesoft.spring.rmi;

import com.lungesoft.spring.rmi.service.MessageExample;
import com.lungesoft.spring.rmi.service.ResponseExample;
import com.lungesoft.spring.rmi.service.ServiceExample;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

public class ClientMain {

    public static void main(String[] args) {
        HttpInvokerProxyFactoryBean factoryBean = new HttpInvokerProxyFactoryBean();
        factoryBean.setServiceUrl("http://localhost:8080/spring/example");
        factoryBean.setServiceInterface(ServiceExample.class);
        factoryBean.afterPropertiesSet();

        ServiceExample service = (ServiceExample) factoryBean.getObject();
        ResponseExample response = service.sayHello(new MessageExample("hello from client"));
        System.out.println(response.getText());
    }

}
