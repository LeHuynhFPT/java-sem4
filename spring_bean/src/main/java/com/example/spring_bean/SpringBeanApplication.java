package com.example.spring_bean;

import com.example.spring_bean.entity.Staff;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanApplication.class, args);


        //using bean factory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader();
        reader.loadBeanDefinitions("bean.xml");
        Staff staff01 = (Staff) factory.getBean("staff01");
        System.err.println(staff01);

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Staff staff02 = (Staff) factory.getBean("staff02.xml");
        System.err.println(staff02);

        Staff staff03 = (Staff)context.getBean("staff03");
        System.err.println(staff03);

    }

}
