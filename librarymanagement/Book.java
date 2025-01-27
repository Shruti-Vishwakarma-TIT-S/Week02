package com.inheritancequestions.single.librarymanagement;

public class Book {
    String title;
    int publicationYear;
    Book(){
        System.out.println("Details of Author");
    }
    Book(String title, int publicationYear){
        System.out.println("Details of Book ");
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo(){
        System.out.println("Title of Book "+ title+ "\nPublished In Year "+ publicationYear);
    }
}
