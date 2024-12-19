import java.util.Scanner;
class TwistedPrimeNumber4thMarch
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

while(true)
		{
			int i,rev=0,num;


			System.out.println("Enter number :");
			num=sc.nextInt();

			 for (i=2;i<num ;i++)
			 {
				if(num%i==0)
				{
					break;
				}
			 }

			 if(num==i)
			{
				System.out.println("prime number :"+num);

				while(num>0)
				{
					 int mod=num%10;
					rev=rev*10+mod;
					num/=10;
				}
				System.out.println("rev number :"+rev);

				for (i=2;i<rev ;i++)
				{
					if(rev%i==0)
					{
						break;
					}
				}

				if(rev==i)
				{
					 System.out.println("twisted prime number :"+rev);
				}
				else
				{
					 System.out.println("not a twisted prime number :"+rev);
				}

			 
			}
			else
			{
				System.out.println("not a prime number :"+num);
			}
		}
	}
}
