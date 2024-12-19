class TwinPrime24March24V1 
{
	public static void main(String[] args) 
	{
		 twinPrime(17,81);
	}
	public static void twinPrime(int num1,int num2)
	{
		if(checkPrime(num1) && checkPrime(num2) )
		{
			int diff=num1-num2;
			if(diff<0)
			{
				diff=-diff;	
			}
			if(diff<=2)
			{
				System.out.println(num1+","+num2+" are twin prime number");
			
			}
			else
			{
				System.out.println(num1+","+num2+" are  not twin prime number");
			}
		}
		else 
		{
			System.out.println(num1+","+num2+" both or one of the number is not a prime number");
			
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
}
