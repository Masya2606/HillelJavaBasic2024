package com.gmail.mariasyt26.javaBasic.homework.homework11;

public class Person {
    String name;
    int age;
    String profession;

    //конструктор
    public Person ( String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void changeProfession(Person person, String newProfession){//можно ли передавать конкретные поля класса как параметры? нужно ли?
        this.profession = newProfession;
    }
}
