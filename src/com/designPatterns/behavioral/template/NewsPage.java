package com.designPatterns.behavioral.template;

public class NewsPage extends WebsiteTemplate {

    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
