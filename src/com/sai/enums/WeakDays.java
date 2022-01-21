package com.sai.enums;


public enum WeakDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    private WeakDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

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

        System.out.println("mood: " + weakDays.getMood());
    }

    public static void main(String[] args) {
        Today today = new Today(WeakDays.FRIDAY);
        today.daysInfo();

        System.out.println(today.weakDays);

        WeakDays w1 = WeakDays.FRIDAY;
        WeakDays w2 = WeakDays.MONDAY;
        WeakDays w3 = WeakDays.FRIDAY;


        WeakDays2 w4 = WeakDays2.FRIDAY;

        System.out.println(w1.equals(w4));

        WeakDays w14 = WeakDays.valueOf("MONDAY");
        System.out.println(w14);

        WeakDays[] values = WeakDays.values();
        System.out.println("!!!!!!!!!! ");

        for (WeakDays value: values) {
            System.out.println(value);
        }

    }


}

enum WeakDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}