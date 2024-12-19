class UGLYnum25March24a1Final 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			uglyNum(i);
		}
		
	}
	public static void uglyNum(int num)
	{
		if(ugly(num))
		{
			System.out.println(num);
		}
		/*else
		{
			System.out.println(num+" is not a ugly number.");
		}*/
		
	}
	public static boolean ugly(int num)
	{
		while(num!=1)
		{
			if(num%2==0 || num%3==0 || num%5==0)
			{
				int div;

				if(num%2==0)
				div=2;
				else if(num%3==0)
				div=3;
				else
				div=5;
				num=mUgly(num,div);
			}
			else
			{
				break;
			}
		}
		
		return num==1;
	}

	public static int mUgly(int num,int div)
	{
		return num/div;
		
	}
}

//UGLYnum25March24a1Final