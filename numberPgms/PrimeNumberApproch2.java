//Title:prime number approch 2
//(num/2) approch


public class PrimeNumberApproch2 
{
    public static void main(String[] args) 
    {
        int num=101,i;

        for ( i = 2; i <= num/2; i++) 
        {
            if (num%i==0) {
                break;
            }
        }

        if (((num/2)+1)==i) {
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is NOT a prime number");
        }
    }
}
