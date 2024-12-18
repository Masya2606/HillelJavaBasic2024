package com.gmail.mariasyt26.java.homework.homework11;

public class Person {
    String name;
    int age;
    String profession;

    //конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void changeProfession(String newProfession) {//можно ли передавать конкретные поля класса как параметры? нужно ли?
        this.profession = newProfession;
    }

    public void describeYourself() {
        System.out.println("Iм'я: " + name + ", Вік: " + age + " Професія: " + profession);
    }
}
