public class Patt2 {
    public static void main(String[] args) {
        int row=4;

        for (int i =row,k=1 ; i >0; i--) {
            for (int j = 0; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++,k++) {
                System.out.printf("%d",k);
            }
            System.out.println();
        }
    }
}
