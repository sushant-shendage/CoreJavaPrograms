
public class PrimeNumber {
    public static void main(String[] args) {
        int num=101;
        int i;
        for ( i = 2; i < num; i++) {
            if (num%i==0) {
                break;
            }
        }
        if (i==num) {
            System.out.println("prime number..!");
        }
        else{
            System.out.println("NOT a prime number..!");

        }
    }
    
}
