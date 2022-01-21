package com.sai.enums;


public enum WeakDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


class Today {
    WeakDays weakDays;

    public Today(WeakDays weakDays) {
        this.weakDays = weakDays;
    }

    void daysInfo() {
        switch (weakDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go to work!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("weekend!!!!!!!!!!!!!");
                break;
        }
    }

    public static void main(String[] args) {
        Today today = new Today(WeakDays.SATURDAY);
        today.daysInfo();
    }


}