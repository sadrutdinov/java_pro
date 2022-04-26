package com.designPatterns.behavioral.observer;

public class JobSaerch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();

        site.addVacancy("First java position");
        site.addVacancy("Second java position");

        Observer subscriber1 = new Subscriber("Aydar");
        Observer subscriber2 = new Subscriber("Alex");

        site.addObserver(subscriber1);
        site.addObserver(subscriber2);

        site.addVacancy("Third java pos");

        site.removeVacancy("First java position");
    }
}
