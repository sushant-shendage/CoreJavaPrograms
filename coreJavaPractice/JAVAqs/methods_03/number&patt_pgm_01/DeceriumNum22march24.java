class DeceriumNum22march24 
{
	public static void main(String[] args) 
	{
		 DeseriumNum(175);
	
	}

	public static void DeseriumNum(int num)
	{
		if(decerium(num))
		{
			System.out.println(num+" is a deserium num");
		}
		else
		{
			System.out.println(num+" is not a deserium num");
		}
	}
	public static boolean decerium(int num)
	{
		int count=count(num),sum=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=pow(i%10,count);
				count--;
		}

		return sum==num;

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
