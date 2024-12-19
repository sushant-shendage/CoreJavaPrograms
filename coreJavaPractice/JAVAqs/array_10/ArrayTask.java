
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number friends :");
        int size = sc.nextInt();

        String[] s1 = new String[size];

        sc.nextLine();

        for (int i = 0; i < s1.length; i++) {
            s1[i] = sc.nextLine();
        }

        for (int j = 0; j < size; j++) {
            System.out.println("s1[]:" + s1[j]);
        }
    }

}
