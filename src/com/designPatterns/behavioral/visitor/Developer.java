package com.designPatterns.behavioral.visitor;

public interface Developer {
    public void create(Class projectClass);
    public void create(Database database);
    public void create(Test test);
}
