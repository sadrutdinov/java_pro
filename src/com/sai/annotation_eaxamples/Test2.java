package com.sai.annotation_eaxamples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test2 {
    public static void main(String[] args) {
        Class<?> xiaomiClass = Xiaomi.class;
        SmartPhone sm1 = xiaomiClass.getAnnotation(SmartPhone.class);
        System.out.println("info Xiaomi: " + sm1.OS() + " " + sm1.yearOfCompanyCreation());

        Class<?> iphoneClass = Iphone.class;
        SmartPhone sm2 = iphoneClass.getAnnotation(SmartPhone.class);
        System.out.println("info Iphone: " + sm2.OS() + " " + sm2.yearOfCompanyCreation());

    }

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "android";

    int yearOfCompanyCreation() default 2010;
}

@SmartPhone()
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
