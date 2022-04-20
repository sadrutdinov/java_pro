package com.designPatterns.creational.abstractFactory.banking;

import com.designPatterns.creational.abstractFactory.Developer;
import com.designPatterns.creational.abstractFactory.ProjectManager;
import com.designPatterns.creational.abstractFactory.ProjectTeamFactory;
import com.designPatterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
