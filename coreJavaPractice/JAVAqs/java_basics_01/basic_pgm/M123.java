class M123 
{
	public static void main(String[] args) 
	{
		 int fib_limit=10;
		 int pnum=7;

		prime(pnum);
		fib_element(fib_limit);
	}

	public static void prime(int numM)
	{
		int i;
		for (i=2;i<numM;i++ )
		{
			if (numM%i==0)
			{
				break;
			}
		}
		if (i==numM)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("NOT prime number");
		}
	}

	public static void fib_element(int numM)
	{
		int num1=0,num2=1,sum;

		for (int i=1;i<=numM ;i++ )
		{
			System.out.println(num1+",");
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}
		
	}
}
