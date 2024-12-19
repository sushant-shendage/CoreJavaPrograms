class HappyNum23March24v2
{
	public static void main(String[] args) 
	{
		happyNum(49);
	}

	public static void happyNum(int num)
	{
		int sum=0;
		while(num!=1)
		{
			for (int i=num;i!=0 ;i/=10 )
			{
				sum+=(i%10)*(i%10);
				System.out.println("sum : "+sum);
			}
			num=sum;
			System.out.println("num : "+num);
		}
	}
}
