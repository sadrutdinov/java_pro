package com.designPatterns.behavioral.visitor;

public class Class implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
