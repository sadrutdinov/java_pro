package com.designPatterns.behavioral.visitor;

public class Project implements ProjectElement{

    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new Class(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (var element: projectElements
             ) {
            element.beWritten(developer);
        }
    }
}
