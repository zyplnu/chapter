package com.smart.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.testng.Assert.assertNotNull;

public class BeanFactoryTest {

    @Test
    public void getBeanName() {

        ResourceBundle rb1 = ResourceBundle.getBundle("com/smart/beanfactory/resource",Locale.CANADA);
        ResourceBundle rb2 = ResourceBundle.getBundle("com/smart/beanfactory/resource");

        System.out.println("us:" + rb1.getString("greeting.common"));

        System.out.println("cn:" + rb2.getString("greeting.common"));

        System.out.println("cn:" + rb2.getString("greeting.night"));
    }

}
