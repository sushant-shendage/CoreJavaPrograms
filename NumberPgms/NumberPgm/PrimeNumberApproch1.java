package javapgms.NumberPgms.popularNumPgm;
class PrimeNumberApproch1
{
    public static void main(String[] args) 
    {
        int num=101,i;

        for ( i = 2; i < num; i++) 
        {
            if (num%i==0) {
                break;
            }
        }

        if (num==i) {
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is NOT a prime number");
        }
        
    }
}