package Lecture2;

public class PetShop {
    public static void main(String[] args) {

        Pet myPet = new Pet("Fluffy", 5, "Cat");

        Pet myPet2 = new Pet("Buddy", 3, "Dog");


        /* - Want to do the same thing as in Pet.java:
         * System.out.println("My pet's name is " + myPet.name + " and it is a " + myPet.type + " and it is " + myPet.age + " years old");
         *
         * - Doesn't work because name, age, and type are private --> can only be accessed from within the same class
         * Solution: create a method in Pet.java that returns the name, age, and type (getters)
         */

        /* NEW: Use Getter methods
         * - Getter methods are used to get the value of a private variable
         */
        System.out.println("My pet's name is " + myPet.getName() + " and it is a " + myPet.getType() + " and it is " + myPet.getAge() + " years old");

        System.out.println("My seconds pet's name is " + myPet2.getName() + " and it is a " + myPet2.getType() + " and it is " + myPet2.getAge() + " years old");

        // Question: What if I want to change the name of myPet?
        // Answer: Create a method in Pet.java that changes the name (setter)
        myPet.setName("Fluffy Jr.");
        myPet.setAge(1);
        // \n is a new line (nicer to read)
        System.out.println("\nAfter: setters");
        System.out.println("My new pet's name is " + myPet.getName() + " and it is a " + myPet.getType() + " and it is " + myPet.getAge() + " years old");

        // Question: What if I set mypet to mypet2?
        // Answer: myPet = myPet2;
        // --> myPet is now the same object as myPet2
        myPet = myPet2;
        System.out.println("\nAfter: 'myPet = myPet2'");
        System.out.println("My pet's name is " + myPet.getName() + " and it is a " + myPet.getType() + " and it is " + myPet.getAge() + " years old");
        System.out.println("My seconds pet's name is " + myPet2.getName() + " and it is a " + myPet2.getType() + " and it is " + myPet2.getAge() + " years old");
    }
}
