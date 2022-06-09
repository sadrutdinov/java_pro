package com.modernJavaInAction.chapter821;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Main837 {
    public static void main(String[] args) {
        Map<String, String> family = Map.ofEntries(
                entry("Teo", "Star Wars"), entry("Cristina", "James Bond"));
        Map<String, String> friends = Map.ofEntries(
                entry("Raphael", "Star Wars"), entry("Cristina", "Matrix"));

        Map<String, String> everyone = new HashMap<>(family);

        friends.forEach((k,v) -> everyone.merge(k, v, (mov1, mov2) -> mov1 + " & " + mov2));

        System.out.println(everyone);
    }
}
