import java.util.Scanner;

@SuppressWarnings("WrongPackageStatement")
class Loops {
    public static void main(String[] args) {

        // Loops are used when you need to repeat the same code a bunch of times.
        // It's usually used to iterate over a List of data or with user interfaces(UI) so the app keeps running.
        // In a while loop a condition is evaluated until the condition is false.
        int index = 0;
        while (index < 10) {
            System.out.println("I: " + index);
            index++;
        }

        // A common pattern with a while loop it's to set it to true generating an infinite loop. But inside the loop.
        // we add a condition with break statement, so it stops the loop.
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("Type anything to stay inside the loop");
            System.out.println("Type: exit to stop the loop");
            String userInput = scan.nextLine();
            if (userInput.equals("exit")) {
                System.out.println("Bye Bye");
                break;
            }
            System.out.println("Oh baby!!! Here we go again");
        }

        // Most common and used for loop.
        for (int i = 0; i < 10; i++) {
            System.out.println("I: " + i);
        }

        // there's also a for loop for iterating over arrays and collections.
        // this has a clear syntax, but you don't have access to the index with it.
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("It will iterate over each element: " + number);
        }

        // There's a bunch of other ways to iterating(looping) in Java but they are associated with streams.
        //  Examples with streams will be added in another chapters.

    }
}