class RotatingPrimeOrNot23March24 
{
	public static void main(String[] args) 
	{
		 rotatingPrime(162);
	}
	public static void rotatingPrime(int num)
	{
		if(checkPrime(num))
		{
			 if(rotationComplete(num))
			{
				System.out.println(num+" is a rotating prime number");
			}
			else
			{
				System.out.println(num+" is not a rotating prime number");
			}

			
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
	} 

	public static boolean checkPrime(int num)
	{
		int i;
		for (i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				break;
			}
		}

		return i==num;
	}
	public static boolean rotationComplete(int num)
	{
		int c1num=num;
		int count=count(num)-1;
		//num=num%10*pow(10,count)+num/10;

		do
		{
			if(checkPrime(num))
			{
				num=num%10*pow(10,count)+num/10;
			}
			else
			{
				break;
			}
		}while(num!=c1num);

		return c1num==num;

	}
	public static int count(int num)
	{
		int count=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			count++;
		}
		return count;
	}

	public static int pow(int base,int index)
	{
		int prod=1;
		for (int i=1;i<=index ;i++)
		{
			prod*=base;
		}
		return prod;
	}
}
