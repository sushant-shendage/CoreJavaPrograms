class AutomorphicNumRange25March24l1w1 
{
	public static void main(String[] args) 
	{
		 automorphicNum(1,100);
	}

	public static void automorphicNum(int num1,int num2)
	{
		for (int i=num1;i<=num2 ;i++ )
		{
			if(automorphic(i))
			{
			System.out.println(i+" is a automorhic number");
			}
		}
	}

	public static boolean automorphic(int num)
	{
		return num*num%pow(10,count(num))==num;
	}
	public static int count(int num)
	{
		int count=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			count++;
		}

		return count;
	}

	public static int pow(int base,int index)
	{
		int prod=1;
		for (int i=1;i<=index ;i++ )
		{
				prod*=base;
		}
			return prod;
	}
}
