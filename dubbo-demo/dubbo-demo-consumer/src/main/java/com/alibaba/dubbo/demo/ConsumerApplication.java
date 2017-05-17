package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.demo.consumer.HelloWorldConsumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by listening on 2017/3/7.
 */
public class ConsumerApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-demo-consumer.xml");
        context.start();

        HelloWorldConsumer consumer = (HelloWorldConsumer) context.getBean("helloWorldConsumer");
        consumer.start();
    }
}
