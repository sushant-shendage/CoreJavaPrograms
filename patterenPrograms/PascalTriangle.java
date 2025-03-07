public class PascalTriangle {

    public static void main(String[] args) {

        int inputRows = 5;

        for (int i = 0; i < inputRows; i++) {
            for (int j = inputRows - i; j > 0; j--) 
                System.out.print(" ");
            
            for (int j = 0; j <= i; j++) 
                System.out.print(ncn(i, j) + " ");
            
            System.out.println();
        }

        // System.out.println(ncn(7,7));
    }

    static int ncn(int i, int j) {

        return fact(i)/(fact(j)*fact(i-j));
    }

    static int fact(int num) {
        int prod = 1;
        if (num == 0 || num == 1) {
            return 1;
        } else {
            for (int i = 2; i <= num; i++) {
                prod *= i;
            }
            return prod;
        }
    }
}
