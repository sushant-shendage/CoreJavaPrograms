class  NestedLoops03_07thmarch
{
	public static void main(String[] args) 
	{
		 int num=123,sum=0;
		System.out.println("num :"+num);
		while (num>0)
		{
			int mod=num%10;

			
			int fact=1;
			for (int i=1;i<=mod ;i++ )
			{
				fact=fact*i;
			}

			sum=sum+fact;
			//System.out.println("sum of all  :"+sum);

			num/=10;

		}

		System.out.println("sum of all factorial :"+sum);
		 

	}
}
//we can optimize this code by intilizing loop with 2