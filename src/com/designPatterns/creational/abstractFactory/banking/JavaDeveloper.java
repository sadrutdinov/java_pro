package com.designPatterns.creational.abstractFactory.banking;

import com.designPatterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes java code");
    }
}
