// package javapgms.NumberPgms.NumberPgm;

public class PrimeNumber25 {
    public static void main(String[] args) {
        int num=7,i=2;

        for (; i < num; i++) {
            if(num%2==0){
                break;
            }
        }

        if(i==num){
            System.out.printf("the given number %d is prime",num);
        }
        else{
            System.out.printf("the given number %d is NOT prime",num);

        }
    }
    
}
