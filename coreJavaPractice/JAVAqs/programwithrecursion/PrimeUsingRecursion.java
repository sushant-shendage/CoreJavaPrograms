
public class PrimeUsingRecursion {
    public static void main(String[] args) {
        int num=19;

        recPrime(num,2);
    }
    public static void recPrime(int num,int num2)
    {
        if (num%num2==0) {
            System.out.println(num+" is Not Prime");
            return;
        }
        else 
        {
            num2++;
            recPrime(num, num2);
        }
        if (num2==num/2+1) {
            System.out.println(num+" is Prime");
            return; 
        }
    }
}
