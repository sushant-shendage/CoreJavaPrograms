class ReturnTwoNum23march24 
{
	public static void main(String[] args) 
	{
		 give2Num(31);
	}

	public static void give2Num(int num)
	{
		for (int i=1;i<=num;i++)
		{
			for (int j=1;j<=num;j++)
			{
				if(i*i+j*j==num)
				{
					System.out.println("i : "+i+" j : "+j);
				}
			}
		}
	}
}
