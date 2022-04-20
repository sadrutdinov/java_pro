package com.designPatterns.creational.abstractFactory.website;

import com.designPatterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("website PM manage project");
    }
}
