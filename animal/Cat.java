package com.inheritancequestions.assisted.animal;

public class Cat extends Animal {
    Cat(String name, int age){
        super(name, age);
        //System.out.println(name+" "+age);
    }
    @Override
    public void makeSound(){
        System.out.println("meow meow");
    }
}
