package com.modernJavaInAction.chapter821;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main836 {
    public static void main(String[] args) {
        Map<String, String> mov = new HashMap<>();

        mov.put("Alex", "Gor'ko");
        mov.put("Aydar", "Avengers");

        mov.replaceAll((friend, movie) -> movie.toUpperCase(Locale.ROOT));

        System.out.println(mov);
    }
}
