@SuppressWarnings("WrongPackageStatement")
class Conditionals {

    public static void main(String[] args) {

        if (true) {
            System.out.println("The main and most used if statement");
        } else {
            System.out.println("False");
        }

        if (true) System.out.println("No curly braces needed if has only 1 line");

        if (false)
            System.out.println("No curly braces needed if only 1 line");
        else
            System.out.println("You can have a else without curly braces too");

        //With tenary operator
        // Good for short expressions and to use in the return of a method. Can make your code harder to read.
        String foundUser = (true) ? "User found" : "User not found";
        System.out.println(foundUser);

    }
}