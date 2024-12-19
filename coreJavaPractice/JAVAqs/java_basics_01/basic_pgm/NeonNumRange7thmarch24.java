class NeonNumRange7thmarch24
{
	public static void main(String[] args) 
	{

		for (int i=1;i<100 ;i++)
		{
			int num=i;
			
		int squre=num*num,sum=0;

		while(squre>0)
		{
			int mod=squre%10;

			sum+=mod;

			squre/=10;
		}
		if(sum==num)
		{
			System.out.println("Neon num : "+num);
		}
		}
		
		 
	}
}
