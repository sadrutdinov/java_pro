package com.designPatterns.creational.abstractFactory.banking;

import com.designPatterns.creational.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code");
    }
}
