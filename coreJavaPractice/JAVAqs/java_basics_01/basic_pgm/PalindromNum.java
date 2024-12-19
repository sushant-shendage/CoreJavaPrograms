import java.util.Scanner;
class PalindromNum 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			int revNum=0,numMod;


			System.out.println("\nEnter any positive integer number : ");
			int num=sc.nextInt();
			int original_num=num;

			System.out.println("Entered integer                   : "+num);

			while(num>0)
			{
				numMod=num%10;
				revNum=revNum*10+numMod;
				num/=10;
			}

			System.out.println("reverce of entered number integer : "+revNum);

			if(revNum==original_num)
			{
				System.out.println("Result:Palindrom number");
			}else
			{
				System.out.println("Result:not a palindrom number");
			}

		}
	}
}