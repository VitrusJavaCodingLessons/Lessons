package Lecture2;

public class Pet {

    /* Access Modifiers
     *
     * - private - means that the variable can only be accessed from within the same class
     * - public - means that the variable can be accessed from anywhere (from other classes)
     * (- protected - we will talk about it later)
     *
     * - They go in front of the data type of variables, methods, and classes (and constructors)
     *
     */

    private String name;
    private int age;
    private String type;

    /* Constructor
     * - Constructor can have parameters
     * - Parameters are the values that you pass to the constructor
     */
    public Pet(String name, int age, String type) {
        // "this" is a keyword that refers to the current object
        // means go into this object and then from that object get the name
        this.name = name;
        // means go into this object and then from that object get the age
        this.age = age;
        // ...
        this.type = type;
    }

    public static void main(String[] args) {
        //
        Pet myPet = new Pet("Fluffy", 5, "Cat");

        /*
         *   - "myPet.name" means go into myPet object and then from that object get the name
         *   - You can add a string to another string using the "+" operator
         *
         *
         */

        System.out.println("My pet's name is " + myPet.name);


        System.out.println("My pet's age is " + myPet.age);
        System.out.println("My pet's type is " + myPet.type);

        //System.out.println("My pet's name is " + myPet.name + " and it is a " + myPet.type + " and it is " + myPet.age + " years old");
    }

}
