package Lecture1;

public class Pet {
    /* Variables
     *
     * - in java to declare a variable you need to specify the data type then a name of the variable
     *
     * Example:
     *  String name;
     *
     *  - String is the data type
     *  - name is the name of the variable
     *
     *  Common Data Types:
     *  - int: integer (whole number)
     *  - double: decimal number
     *  - String: text
     *  - boolean: true or false
     *
     *  Set value to a variable:
     *   Example:
     *    String name = "Fluffy";
     *
     *   - = is an assignment operator means set the value of the right side TO the left side
     *   - The String name is now set to "Fluffy"
     */

    // name of the pet, String means text (String always with a capital letter unlike other data types)
    String name = "Fluffy";
    // age of the pet, int means integer (whole number)
    int age = 5;
    // type of the pet
    String type = "Cat";

    /* Constructor
     *   - Constructor is a special method that is called when an object is created
     *   - Constructor has the same name as the class
     *   - Constructor doesn't have a return type
     *   - Constructor is used to initialize the object
     *
     *   public ClassName() {
     *       // Code
     *   }
     */
    public Pet() {
    }

    public static void main(String[] args) {
        // new means create a new object (in this case, a new Pet object)
        Pet myPet = new Pet();

        /*
         *   - "myPet.name" means go into myPet object and then from that object get the name
         *   - You can add a string to another string using the "+" operator
         */

        System.out.println("My pet's name is " + myPet.name);


        System.out.println("My pet's age is " + myPet.age);
        System.out.println("My pet's type is " + myPet.type);

        //System.out.println("My pet's name is " + myPet.name + " and it is a " + myPet.type + " and it is " + myPet.age + " years old");
    }
}
