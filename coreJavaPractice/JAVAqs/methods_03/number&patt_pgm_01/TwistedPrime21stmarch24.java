class TwistedPrime21stmarch24 
{
	public static void main(String[] args) 
	{
		int num=19;
		int rev=revNum(num);

		 if(checkPrimeOrNot(num) && checkPrimeOrNot(rev))
		{
			System.out.println(num+" is twisted prime number");
		
		}
		else
		{
			System.out.println(num+" is not a twisted  prime number");
		}
	}
	public static boolean checkPrimeOrNot(int num)
	{
		int i;
		for ( i=2;i<num ;i++ )
		{
			if(num%i==0)
			{
				break;
			}
		}

		return i==num;
	}
	
	public static int revNum(int num)
	{
		int rev=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}

		return rev;
	}
}