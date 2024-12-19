class NeonNum6thmarch
{
	public static void main(String[] args) 
	{
		int num=8;
		int squre=num*num,sum=0;

		while(squre>0)
		{
			int mod=squre%10;

			sum+=mod;

			squre/=10;
		}
		if(sum==num)
		{
			System.out.println("Neon num");
		}
		else
		{
			System.out.println("not Neon num");
		}
	}
}
