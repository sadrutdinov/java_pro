package com.designPatterns.creational.abstractFactory.website;

import com.designPatterns.creational.abstractFactory.Developer;

public class PhpDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php dev writes php code");
    }
}
