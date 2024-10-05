public class PrimeNum
{
    public static void main(String[] args) 
    {
        int num=7,i;
        
        for ( i = 2; i < num; i++) {
            if (num%i==0) {
                 break;
            }
        }

        if (i==num) {
            System.out.println(num+" is a prime number.");
        }
        else
        {
            System.out.println(num+" is a prime number.");
        }
    
    }
}