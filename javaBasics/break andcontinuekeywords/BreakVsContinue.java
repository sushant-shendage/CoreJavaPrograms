package javapgms.javaBasics.break andcontinuekeywords;

public class BreakVsContinue {
   public static void main(String[] args) {
    // Break Statement
        // The break statement is used to exit from a loop or a switch statement.
        // When a break statement is encountered, the control exits the loop immediately.
        System.out.println("Using Break Statement in Loop:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i equals 5
            }
            System.out.println("Number: " + i);
        }

        // Demonstrating Break with Switch Case
        System.out.println("\nUsing Break Statement in Switch Case:");
        int day = 3; // Example day number
        switch (day) {
            case 1:
                System.out.println("It's Monday.");
                break; // Exit the switch after executing case 1
            case 2:
                System.out.println("It's Tuesday.");
                break; // Exit the switch after executing case 2
            case 3:
                System.out.println("It's Wednesday.");
                break; // Exit the switch after executing case 3
            default:
                System.out.println("It's some other day.");
                break; // Exit the switch for any other case
        }

        // Continue Statement
        // The continue statement is used to skip the current iteration of a loop
        // and continue with the next iteration. It does not exit the loop, 
        // just skips to the next iteration.
        System.out.println("\nUsing Continue Statement:");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println("Skipping even number: " + j);
                continue; // Skip the current iteration for even numbers
            }
            System.out.println("Odd Number: " + j);
        }
   } 
}
