package org.example;

public class Dog {

    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + ", I'm " + age + " years old, and I'm " + color + ".");
    }
}
