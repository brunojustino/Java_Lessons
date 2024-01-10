// This is a single-line comment

/*
 * This is a
 * multi-line comment
 */

/*
All Java files starts with the class* keyword followed by the name of the class

public class Basics {

}
All Java projects should have a main method. This is the entry point of your app
    public static void main(String[] args) {
        1st line of code to be executed
    }

Case Sensitivity: Java is case-sensitive, meaning variable and Variable are different.

Reserved Keywords
class, public, private, static, void, if, else, while, for, switch, case, break, continue, return, new, this, super, etc.

 */
public class Basics {
    public static void main(String[] args) {
        // Variables and Data Types
        int age = 25;
        double height = 5.9;
        char gender = 'M';
        boolean isStudent = true;
        String name = "John";

        // Conditionals
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Looping
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Methods
        greet(name);
    }

    // Method
    public static void greet(String person) {
        System.out.println("Hello, " + person + "!");
    }
}
