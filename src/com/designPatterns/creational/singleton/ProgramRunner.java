package com.designPatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();

        programLogger.addLogInfo("first log");
        programLogger.addLogInfo("second log");
        programLogger.addLogInfo("third log");
        programLogger.addLogInfo("aydar");

        programLogger.showLogFile();
    }
}
