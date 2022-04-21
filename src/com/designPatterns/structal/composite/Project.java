package com.designPatterns.structal.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDev1 = new JavaDeveloper();
        Developer javaDev2 = new JavaDeveloper();
        Developer cppDev = new CppDeveloper();

        team.addDeveloper(javaDev1);
        team.addDeveloper(javaDev2);
        team.addDeveloper(cppDev);

        team.createProject();
    }
}
