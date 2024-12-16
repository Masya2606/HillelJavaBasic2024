package com.gmail.mariasyt26.javaBasic.homework.homework11;

public class PersonRunner {
    public static void main(String[] args) {
        Person john = new Person("John", 30, "інженер");
        Person mary = new Person("Mary", 25, "вчитель");
        Person bob = new Person("Bob", 35, "лікар");

        john.describeYourself();
        mary.describeYourself();
        bob.describeYourself();

        mary.changeProfession("архітетор");
    }
}
