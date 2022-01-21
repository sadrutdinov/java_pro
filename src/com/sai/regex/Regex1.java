package com.sai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "Aydar Sadrutdinov, Russia, Izhevsk, Kalanin street, 99, flat 48, email: sadavfsaf@yandex.ru," +
                "postcode: AA99, Phone Number: +71234563789";

//        Pattern pattern = Pattern.compile("\\w+");

//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); // 84 48

//        Pattern pattern = Pattern.compile("\\+\\d{11}"); // +71234567893

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)"); // sadavfsaf@yandex.ru




        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
