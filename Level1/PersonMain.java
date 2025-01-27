// This class is for representing a person
class Person {
    // These are the details of the person: name and age
    private String name;
    private int age;
    // Constructor to set the name and age of the person
    Person(String name, int age){
        this.name = name;  // Set person's name
        this.age = age;    // Set person's age
    }
    // Copy constructor to copy details from another person object
    Person(Person p){
        this.name = p.name;  // Copy name from another person
        this.age = p.age;    // Copy age from another person
    }
    // Method to display the person's details
    void display(){
        System.out.println("Name and age of this person is: "+ name + " "+ age);
    }
}
// This class is for running the Person program
public class PersonMain {
    public static void main(String[] args) {
        // Set name and age for the person
        String name = "Shruti";
        int age = 20;
        // Create a Person object with name and age
        Person p1 = new Person(name, age);
        // Create a new Person object by copying details from p1
        Person p2 = new Person(p1);
        // Display details of the first person (p1)
        p1.display();
        // Display details of the second person (p2)
        p2.display();
    }
}