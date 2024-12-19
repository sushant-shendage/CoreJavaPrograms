import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random rand = new Random();

        int U = 0, C = 0;

        // System.out.println("randNumC:"+randNumC);
        // System.out.println("randNumU:"+randNumU);

        Scanner sc = new Scanner(System.in);

        System.out.println("wellcome to new game... ");

        System.out.print("Enter you name: ");
        String UN = sc.next();
        String CN = "Computer";
        System.out.print("wellcome to new game... To roll your dice enter any +ve number :");
        int i1 = sc.nextInt();

        do {
            
            int randNumC = rand.nextInt() % 6 + 1;
            int randNumU = rand.nextInt() % 6 + 1;

            if (randNumC < 0) {
                randNumC *= (-1);
            } else if (randNumC == 0) {
                randNumC += 1;
            }

            if (randNumU < 0) {
                randNumU *= (-1);
            } else if (randNumU == 0) {
                randNumU += 1;
            }

            U += randNumU;
            C += randNumC;
            for (int i = 1; i < 101; i++) 
            {
                if(i==U || i==C)
                {
                    if (U==i) {
                        System.out.print("+ ");
                }
                if(C==i)
                {
                    System.out.print("- ");
                }
                if (C==i && U==i ) {
                    System.out.print("+-");
                }

                }
                else{
                    System.out.print("==");
                }
                
                if (i % 10 == 0) 
                {
                    System.out.println();
                }

            }

            if (U >= 100 || C >= 100) {
                if (U == 100 || C == 100) {
                    if (U == 100) {

                        System.out.println("randNumC:" + randNumC);
                        System.out.println("randNumU:" + randNumU);

                        System.out.println("U:" + UN + ":" + U);

                        System.out.println("C:" + CN + ":" + C);

                        System.out.println(UN + " win the game");
                        break;
                    }
                    if (C == 100) {
                        System.out.println("randNumC:" + randNumC);
                        System.out.println("randNumU:" + randNumU);

                        System.out.println("U:" + UN + ":" + U);

                        System.out.println("C:" + CN + ":" + C);

                        System.out.println(CN + " win the game");
                        break;
                    }
                }
                if (C > 100) {
                    C -= randNumC;
                }
                if (U > 100) {
                    U -= randNumU;
                }
            }

            System.out.println("randNumC:" + randNumC);
            System.out.println("randNumU:" + randNumU);

            System.out.println("U:" + UN + ":" + U);

            System.out.println("C:" + CN + ":" + C);

            System.out.print("To roll your dice enter any +ve number :");
            i1 = sc.nextInt();

        } while (i1 > 0);

    }

}
// game is incompleted 
//make it complete