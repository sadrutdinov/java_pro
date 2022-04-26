package com.designPatterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("creating new project version 1.0");

        project.setVersionAndDate("1.0");

        System.out.println(project);

        System.out.println("saving current version to GH...");

        gitHubRepo.setSave(project.save());

        System.out.println("Updating project to ver 1.1");


        System.out.println("Writing poor code");

        project.setVersionAndDate("1.1");


        System.out.println(project);

        System.out.println("что-то сломалось...");

        System.out.println("откат");

        project.load(gitHubRepo.getSave());

        System.out.println("project after otkat");
        System.out.println(project);

    }
}
