package com.designPatterns.creational.abstractFactory.website;

import com.designPatterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester test website");
    }
}
