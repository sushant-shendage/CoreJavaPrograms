class PrimeDigitSum 
{
	public static void main(String[] args) 
	{
		int num=3578,sum=0;
		 for (int i=num;i!=0 ;i/=10 )
		 {
			 if (checkPrimeOrNot(i%10))
			 {
				 sum+=i%10;
			 }
		 }
		 System.out.println("The sum of prime digits is "+sum);
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
}
/*
   
*/
