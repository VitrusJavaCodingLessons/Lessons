// Package (Folder) called Lecture0 (for organization)
package Lecture0;

/*
 *   - "HelloWorld" is a class
 *
 *   - Class name is always with a capital letter first
 *   - Class name should be the same as the file name
 *
 *   ! --------------------------------------------------------------------- !
 *   - Everything in java is constricted by {} (curly braces) --> Boundaries
 *   - Every line of code should end with a semicolon ;
 *   ! --------------------------------------------------------------------- !
 *
 */
public class HelloWorld {

    /*
     *   - "main" is the method/function name
     *   - "public" is an access modifier
     *   - "static" is a keyword, means it belongs to the class "HelloWorld"
     *   - "void" is a return type - means it doesn't return anything
     *   - "String[] args" is a parameter
     *   - "System.out.println" is a method to print the output
     *
     *   - main method is the entry point of the program
     *   - very important! - without main method, the program won't run
     */

    public static void main(String[] args) {
        // Prints "Hello, World!" to the terminal window.
        // Consists of System (class), out (object), and println (method)
        System.out.println("Hello, World!");

        // This adds a new line in the console
        System.out.println("\n");

        // This calls the method printHelloWorld from below
        printHelloWorld();
    }

    /*
     * This is a method/function (you can call it either way)
     * Method name is always with a lowercase letter first
     * Method name should be descriptive of what the method does
     * Method name should be in camelCase meaning the first word should be lowercase and the rest of the words should be uppercase
     */
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }
}
