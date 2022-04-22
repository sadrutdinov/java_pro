package com.designPatterns.structal.facade;

public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker tracker = new BugTracker();


    public void solveProblems() {
        job.doJob();
        tracker.startSprint();
        developer.doJobBeforeDeadline(tracker);
    }
}
