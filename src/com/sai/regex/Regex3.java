package com.sai.regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s = "Aydar Sadrutdinov, Russia, Izhevsk, Kalanin street, 99, flat 48, email: sadavfsaf@yandex.ru," +
                "postcode: AA99, Phone Number: +71234563789";

        String s2 = "sadavfsaf@yandex.ru";

        boolean result = s2.matches("\\w+@\\w+\\.(ru|com)");
        System.out.println(result);

        String[] array = s.split(" ");

        System.out.println(Arrays.toString(array));

    }
}
