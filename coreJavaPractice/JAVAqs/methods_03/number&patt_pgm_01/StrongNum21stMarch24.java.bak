class StrongNum21stMarch24 
{
	public static void main(String[] args) 
	{
		int num=145,sum=0;
		
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=fact(i%10);
		}
		if (sum==num)
		{
			System.out.println(num+" is a strong num");
		}
		else
		{
			System.out.println(num+" is not a strong num");
		}
	}
	public static int fact(int num)
	{
		int fact=1;
		for (int i=1;i<=num ;i++ )
		{
			fact*=i;
		}
		return fact;
	}
}
