package com.designPatterns.structal.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp Dev writes cpp code...");
    }
}
