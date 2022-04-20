package com.designPatterns.creational.abstractFactory.website;

import com.designPatterns.creational.abstractFactory.Developer;
import com.designPatterns.creational.abstractFactory.ProjectManager;
import com.designPatterns.creational.abstractFactory.ProjectTeamFactory;
import com.designPatterns.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDev();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
