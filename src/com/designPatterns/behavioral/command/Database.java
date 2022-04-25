package com.designPatterns.behavioral.command;

public class Database {
    public void insert() {
        System.out.println("Inserting record...");
    }

    public void update() {
        System.out.println("Updating record...");
    }

    public void delete() {
        System.out.println("Deleting record...");
    }

    public void select() {
        System.out.println("select record...");
    }

}
