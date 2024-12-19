class TwinPrimeInRange24March24w1 
{
	public static void main(String[] args) 
	{
		 TwinPrimeR(2,100);
	}
	public static void  TwinPrimeR(int num1,int num2)
	{

		while(num1<=num2)
		{
			int prime1=nextPrime(num1),prime2;
			 if(checkPrime(num1))
			 { 
				 
				prime2=nextPrime(prime1+1);

				if (prime2-prime1<=2)
				{
					System.out.println(prime1+","+prime2);

				}
				System.out.println(",");
					prime1=prime2;	 
			 }
				  
			 
			num1++;
		}
		
	}

	public static int nextPrime(int num)
	{
		int i; 
		for ( i=num; ;i++ )
		{
			if(checkPrime(i))
			{
				break;
			}
		}
		
		return i;
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
