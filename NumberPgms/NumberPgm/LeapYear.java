// package javapgms.NumberPgms.popularNumPgm;

public class LeapYear {
    public static void main(String[] args) {
        int givenYear = 2100; // Initialize a variable 'givenYear' with the year to check

        // Check if the given year is a leap year
        if ((givenYear % 4 == 0 && givenYear % 100 != 0) || givenYear % 400 == 0) {
            // If the conditions for a leap year are met
            System.out.println(givenYear + " is a leap year..!");
            return; // Exit the method after printing
        }

        // If the conditions for a leap year are not met
        System.out.println(givenYear + " is not a leap year..!");

    }
    
}
