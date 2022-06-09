package com.modernJavaInAction.chapter1000;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("C:\\Users\\Ajdar\\IdeaProjects\\learning\\java-course\\src\\com\\modernJavaInAction\\chapter1000\\test.txt"))
//                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
    }
}
