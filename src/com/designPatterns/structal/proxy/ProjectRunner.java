package com.designPatterns.structal.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://vk.com/feed");

        project.run();
    }
}
