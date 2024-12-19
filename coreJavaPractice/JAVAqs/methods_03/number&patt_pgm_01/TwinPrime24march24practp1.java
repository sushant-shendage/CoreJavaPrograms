class TwinPrime24march24practp1 
{
	public static void main(String[] args) 
	{
		 twinPrime(1,100);
	}
	public static void twinPrime(int num1,int num2)
	{
		int prime1,prime2=0;
		
		prime1=nextPrime(num1);


		while(true)
		{
			prime2=nextPrime(prime1+1);
			if(prime2>num2)
				{break;}
			if (prime2-prime1<=2)
			{
				System.out.println(prime1+","+prime2);
			}
			prime1=prime2;
		}
		
	}
	public static int nextPrime(int num)
	{
		int i;
		for (i=num; ;i++ )
		{
			if (checkPrime(i))
			{
				break;
			}
		}
		return i;
	}
	public static boolean checkPrime(int num)
	{
		int i;
		for (i=2;i<num;i++ )
		{
			if (num%i==0)
			{
				break;
			}
		}
		return i==num;
	}
}
