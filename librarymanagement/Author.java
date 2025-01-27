package com.inheritancequestions.single.librarymanagement;

public class Author extends  Book{
    String name;
    String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    @Override
    public void displayInfo(){
        System.out.println("Name of Author "+ getName()+ "\nBio "+ getBio());
    }
}
