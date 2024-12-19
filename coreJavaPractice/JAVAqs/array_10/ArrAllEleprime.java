import java.util.Arrays;

public class ArrAllEleprime {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 6, 7, 8 };

        System.out.println("original a : " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            if (isprime(a[i])) {

            } else {
                a[i] = nextPrime(a[i]);
            }
            //System.out.println("original a : " + Arrays.toString(a));
        }
        System.out.println("Modified a : " + Arrays.toString(a));

        // System.out.println(nextPrime(8));
        // System.out.println(isprime());

    }

    static boolean isprime(int num) {
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }

        return i == num;
    }

    static int nextPrime(int num) {
        
        for (;;num++) {
            if (isprime(num)) {
                break;

            }
        }
        return num;
    }

}
