package com.gmail.mariasyt26.java.homework.homework12;

public class Employee {
    private String name;
    private int age;
    private String position;
    private String emailAddress;
    private int phoneNumber;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this(name);
        this.age = age;
    }

    public Employee(String name, int age, String position) {
        this(name, age);
        this.position = position;
    }

    public Employee(String name, int age, String position, String emailAddress) {
        this(name, age, position);
        this.emailAddress = emailAddress;
    }

    public Employee(String name, int age, String position, String emailAddress, int phoneNumber) {
        this(name, age, position, emailAddress);
        this.phoneNumber = phoneNumber;
    }

    public void info() {
        System.out.printf("Name: %s\nAge: %d\nPosition: %s\nEmail address: %s\n Phone Number: %d%n", name, age, position, emailAddress, phoneNumber);
    }
}
