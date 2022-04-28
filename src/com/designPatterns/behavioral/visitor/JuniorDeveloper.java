package com.designPatterns.behavioral.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(Class projectClass) {
        System.out.println("WRITING POOR CLASS...");
    }

    @Override
    public void create(Database database) {
        System.out.println("drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test");
    }
}
