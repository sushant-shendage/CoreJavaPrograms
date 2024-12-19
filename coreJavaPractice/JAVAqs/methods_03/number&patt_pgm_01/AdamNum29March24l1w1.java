class AdamNum29March24l1w1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			adamNum(i);
		}
				 	
	}
	public static void adamNum(int num)
	{
		if (adam(num))
		{
			System.out.println(num+" is a adam num");
		}
		/*else
		{
			System.out.println(num+" is not a sunny num");
		}*/
	}

	public static boolean adam(int num)
	{
		 return rev(num*num)==rev(num)*rev(num);
	}
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		return rev;
	}
	 
}