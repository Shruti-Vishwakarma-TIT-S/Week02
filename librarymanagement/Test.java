package com.inheritancequestions.single.librarymanagement;

public class Test {
    public static void main(String[] args) {
        Book b = new Book("The story of my life", 1965);
        b.displayInfo();
        Author a = new Author();
        a.setName("Hellen Keller");
        a.setBio("Writer and Philoshper");
        a.displayInfo();
    }
}
