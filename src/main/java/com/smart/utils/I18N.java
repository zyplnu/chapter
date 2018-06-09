package com.smart.utils;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

import static java.util.Locale.US;

public class I18N {

    public static void main(String[] args) {

        /*ResourceBundle rb1 = ResourceBundle.getBundle("com/smart/beanfactory",Locale.CANADA);*/
        ResourceBundle rb2 = ResourceBundle.getBundle("resource_zh_CN",Locale.CHINA);

        /*System.out.println("us:" + rb1.getString("greeting.common"));*/

        System.out.println("cn:" + rb2.getString("greeting.common"));
        System.out.println();
    }

}
