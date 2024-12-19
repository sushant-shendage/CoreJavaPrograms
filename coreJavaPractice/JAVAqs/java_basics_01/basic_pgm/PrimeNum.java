import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int num=sc.nextInt();
		int den=2;

	 	while(den<(num/2))
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}

		if ((num/2)==den)
		{
			System.out.print("Prime number");
		}
		else
		{
			System.out.print("NOT a Prime number");
		}		 
	}
}
//logic