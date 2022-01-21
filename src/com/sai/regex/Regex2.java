package com.sai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCF";
//        Pattern pattern1 = Pattern.compile("ABC");
//
//        String s1 = "ABCOFABDOF";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OF");

//        String s1 = "abcd abce abc5abcgabch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

        String s1 = "abcd abce abc5abcgabch";
        Pattern pattern1 = Pattern.compile("abc(e|5)");

        Matcher matcher = pattern1.matcher(s1);


        while (matcher.find()) {
            System.out.println("position: " + matcher.start() + "    " + matcher.group());
        }
    }
}
