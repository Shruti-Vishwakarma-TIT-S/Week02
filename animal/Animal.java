package com.inheritancequestions.assisted.animal;

public class Animal {
    String name;
    int age ;
    Animal(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println(name+ " "+ age);
    }
    public void makeSound(){
        System.out.println("Display details");
    }
}
