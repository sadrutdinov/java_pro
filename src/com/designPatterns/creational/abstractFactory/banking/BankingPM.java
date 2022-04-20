package com.designPatterns.creational.abstractFactory.banking;

import com.designPatterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM managed banking project");
    }
}
