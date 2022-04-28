package com.designPatterns.behavioral.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(Class projectClass) {
        System.out.println("rewriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("creating reliable test..." );
    }
}
