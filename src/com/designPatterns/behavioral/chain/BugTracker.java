package com.designPatterns.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("ALL is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("ну тут что-то важное", Priority.IMPORTANT);
        reportNotifier.notifyManager("все сломалось :(", Priority.ASAP);

    }
}
