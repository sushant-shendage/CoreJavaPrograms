package javapgms.Problems;
// package javapgms.puzzelProblems;
/*
 problem :
 -there are 100 doors and 100 monkies 
 -each monkey explore all doors
 -while exploring it, if door number is multiiple of number associated with ,it opens the door if close or closes the door if it is open
   for example  5th monkey,while exploring opned and closed door which is multiple of 5 will close and open respectively
-we have to find that after exploration of all doors of all monkey how many doors will be opened
*/

import java.util.Scanner;

public class Monkeydoor {
    public static void main(String[] args) {

        int doors[] = new int[100];
        for (int i = 0; i < 100; i++) {
            doors[i] = 0;
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("%d ", doors[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        for (int j = 0; j < doors.length; j++) {

            for (int i = 0; i < 100; i++) {

                if ((i + 1) % (j + 1) == 0) {
                    if (doors[i] == 0) {
                        doors[i] = 1;
                    } else {
                        doors[i] = 0;
                    }
                }
            }
        }

        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.printf("%d ", doors[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        int count=0;
        for (int i = 0; i < 100; i++) {
             if (doors[i]==1) {
                count++;
             }
        }

        System.out.printf("ANSWER : %d doors will be open at the end ..!",count);

        
    }

    

}
