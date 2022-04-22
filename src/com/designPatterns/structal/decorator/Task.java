package com.designPatterns.structal.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new JavaDeveloper());

        System.out.println(developer.makeJob());


    }
}
