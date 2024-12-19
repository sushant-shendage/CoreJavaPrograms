class SunnyNum29March24l1w1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			sunnyNum(i);
		}
				 	
	}
	public static void sunnyNum(int num)
	{
		if (sunny(num))
		{
			System.out.println(num+" is a sunny num");
		}
		/*else
		{
			System.out.println(num+" is not a sunny num");
		}*/
	}

	public static boolean sunny(int num)
	{
		int i;
		 for (i=1;i<=num ;i++ )
		 {
			 if (i*i==(num+1))
			 {
				 break;
			 }
		 }
		return (i*i)==(num+1);
	}
	 
}
	 