package com.designPatterns.creational.builder;


public abstract class WebsiteBuilder {

    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCMS();

    abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
