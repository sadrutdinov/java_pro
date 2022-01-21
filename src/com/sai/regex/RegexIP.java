package com.sai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIP {
    public static void main(String[] args) {
//        String s = "Текст-заполнитель — это текст, который" +
//                " имеет некоторые характеристики реального письменного текста," +
//                " но является 192.168.0.1 случайным набором слов или сгенерирован иным образом." +
//                " Его можно использовать для отображения образца шрифтов," +
//                " создания текста для тестирования или обхода спам-фильтра";
//
//
//        Pattern pattern1 = Pattern.compile("\\d{3}.\\d{3}.\\d.\\d"); //
//
//
//        Matcher matcher = pattern1.matcher(s);
//
//        while (matcher.find()) {
//            System.out.println("position: " + matcher.start() + "    " + matcher.group());
//        }


        String ip = "255.38.192.99";
        String ip2 = "182.262.91.05";
        checkIP(ip);
        checkIP(ip2);
    }

    static  void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";


        System.out.println(ip + " is ok? " + Pattern.matches(regex, ip));
    }


}
