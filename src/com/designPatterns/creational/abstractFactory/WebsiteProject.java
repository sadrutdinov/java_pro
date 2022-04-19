package com.designPatterns.creational.abstractFactory;



public class WebsiteProject {
    public static void main(String[] args) {
        PhpDeveloper phpDeveloper = new PhpDeveloper();
        ManualTester manualtester = new ManualTester();
        ProjectManager projectManager = new ProjectManager();

        System.out.println("Creating Project...");
        phpDeveloper.writeCode();
        manualtester.testCode();
        projectManager.manageProject();

    }
}
