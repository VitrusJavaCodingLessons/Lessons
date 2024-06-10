package Lecture2;

public class Pet {

    /* NEW: Access Modifiers
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
     * NEW:
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


    // no main in Pet !
    public static void main(String[] args) {
        //
        Pet myPet = new Pet("Fluffy", 5, "Cat");

        System.out.println("My pet's name is " + myPet.name);


        System.out.println("My pet's age is " + myPet.age);
        System.out.println("My pet's type is " + myPet.type);

        //System.out.println("My pet's name is " + myPet.name + " and it is a " + myPet.type + " and it is " + myPet.age + " years old");
    }

    /* NEW: Getter methods
     * - Getter methods are used to get the value of a private variable
     * - Getter methods are always public
     * - Getter methods always return the data type of the variable
     *
     * Example:
     * public DataType getVariableName() {
     *    return variableName;
     * }
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }


    /* NEW: Setter methods
     * - Setter methods are used to set the value of a private variable
     * - Setter methods are always public
     * - Setter methods always return nothing (void) --> they are just used to set the value of a variable
     * - Setter methods always have a parameter with the data type of the variable
     *
     * Example:
     * public void setVariableName(DataType variableName) {
     *    this.variableName = variableName;
     * }
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }
}
