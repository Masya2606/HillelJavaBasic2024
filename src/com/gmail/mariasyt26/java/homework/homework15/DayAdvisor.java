package com.gmail.mariasyt26.java.homework.homework15;

public enum DayAdvisor implements Advisor {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void advise(DayAdvisor dayAdvisor){
        switch (dayAdvisor){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY-> System.out.println("Stay productive!");
            case FRIDAY -> System.out.println("Happy Friday!");
            default -> System.out.println("Go to sleep!");
        }
    }
}
