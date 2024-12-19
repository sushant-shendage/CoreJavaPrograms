class NivenNum27march24
{
	public static void main(String[] args) 
	{
		 for (int i=1;i<=100 ;i++ )
		 {
			 nivenNum(i);
		 }
	}

	public static void nivenNum(int num)
	{
		 if(niven(num))
		 {
			System.out.println(num+" is a niven num");
		 }
		/* else
		 {
			System.out.println(num+" is not a niven num");
		 }*/
	}

	public static boolean niven(int num)
	{
		int sum=0;
		for (int i=num;i!=0 ;i/=10)
		{
			 
			sum+=i%10;
			 
		}
		return num%sum==0;
	}
}
