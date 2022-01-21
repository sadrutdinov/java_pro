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

//        String s1 = "abcd abce abc5abcgabch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");

//        String s1 = "abcd abce abc5abcgabch";
//        Pattern pattern1 = Pattern.compile("abc.");
////
//        String s1 = "abcd abce abc5abcgabch";
//        Pattern pattern1 = Pattern.compile("abc.$");

//        String s1 = "abcd abce abc5abc6abch";
//        Pattern pattern1 = Pattern.compile("\\D"); // \\d == [0-9]     \\D == [^0-9]

//        String s1 = "abcd abce abc5abc6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // \\w - буквы и цифры кроме пробела [A-Za-z0-9_]

//        String s1 = "abcd abce abc5abc6abch __fa__";
//        Pattern pattern1 = Pattern.compile("\\w+"); // \\w+ - буквы и цифры кроме пробела [A-Za-z0-9_] несколько подряд

//        String s1 = "abcd abce ====! = =ц1 abc5abc6abch __fa__";
//        Pattern pattern1 = Pattern.compile("\\W+"); //
//
//        String s1 = "poka abc zaur dom kino helloworld";
//        Pattern pattern1 = Pattern.compile("\\w{4}"); //
//
//        String s1 = "poka       abccd        zaur dom kino helloworld";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); //  \\s == [\t\r\n\f]

//        String s1 = "abcd abce3 abcdd78cdsmvsd6ffvdsv";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}"); //

//        String s1 = "ABCABABABA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}"); //

//        String s1 = "ABCDABABABAABCABDABABAABCABABABA";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}"); //
//

//        String s1 = "DABABAABCABDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)*"); //

//
//        String s1 = "DABABAABCABDABABDA";
//        Pattern pattern1 = Pattern.compile("\\ADAB"); //


        String s1 = "DABABAABCABDABABDA";
        Pattern pattern1 = Pattern.compile("\\ZBDA"); //

        Matcher matcher = pattern1.matcher(s1);


        while (matcher.find()) {
            System.out.println("position: " + matcher.start() + "    " + matcher.group());
        }
    }
}
