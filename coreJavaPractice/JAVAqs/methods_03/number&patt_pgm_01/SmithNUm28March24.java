class SmithNUm28March24
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=500 ;i++ )
		{
			smithNum(i); 
		}
		
	}

	public static void smithNum(int num)
	{
		if(smith(num))
		{
			System.out.println(num+" is a smith number");
		}
		/*else
		{
			System.out.println(num+" is not a smith number");
		}*/
	}

	public static  boolean smith(int num)
	{
		int sum1=0;
		int sum2=0;

		 for (int i=num;i!=0 ;i/=10 )
		 {
			 sum1+=i%10;
		 }

		 
		 for (int i=num;i!=0 ;i/=10 )
		 {
			 if(num%i==0)
			 {
				sum2+=sumOfDigit(i);
				num/=i;
			 }
			 i=2;
		 }
		  return sum1==sum2;
	}

	public static int sumOfDigit(int num)
	{
		int sum=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=i%10;
			
		}
		return sum;
	}
}
