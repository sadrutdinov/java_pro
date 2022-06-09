package com.modernJavaInAction.chapter1100;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class PropTest {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");

        System.out.println(readDuration(props, "a"));
        System.out.println(readDuration(props, "b"));
        System.out.println(readDuration(props, "c"));



    }

    public static int readDuration(Properties props, String name) {
        return Optional.ofNullable(props.getProperty(name))
                .flatMap(OptUtils::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }
}
