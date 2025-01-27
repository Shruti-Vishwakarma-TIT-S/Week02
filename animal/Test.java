package com.inheritancequestions.assisted.animal;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog("Leo", 1);
        dog.makeSound();
        Cat cat = new Cat("Lily", 5);
        cat.makeSound();
        Bird bird = new Bird("Nightingale", 3);
        bird.makeSound();
    }
}
