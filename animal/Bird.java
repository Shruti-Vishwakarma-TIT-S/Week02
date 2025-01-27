package com.inheritancequestions.assisted.animal;

public class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
        //System.out.println(name+ " "+ age);
    }
    @Override
    public void  makeSound(){
        System.out.println("Chirp chirp");
    }
}
