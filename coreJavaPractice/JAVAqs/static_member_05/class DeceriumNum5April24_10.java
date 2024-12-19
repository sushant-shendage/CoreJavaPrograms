class DeceriumNum5April24_10
{
	public static void main(String[] args) 
	{
		int num=61,sum=0;
		int count=Bl.digitCount(num);

		for (int i=num;i!=0 ;i/=10 )
		{
			int prod=1;
			for (int i=1;i<=count;i++ )
			{
				prod*=num%10;
			}
			count--;
			sum+=prod;	
		}

	}
} 