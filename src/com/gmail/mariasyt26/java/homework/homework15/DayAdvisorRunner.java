package com.gmail.mariasyt26.java.homework.homework15;

public class DayAdvisorRunner {
    public static void main(String[] args) {
        Day[] days = Day.values();
        for (Day day : days) {
            day.advise(day);
        }
    }
}
