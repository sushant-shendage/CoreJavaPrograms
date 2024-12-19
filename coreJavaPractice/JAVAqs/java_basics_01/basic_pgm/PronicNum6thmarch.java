class PronicNum6thmarch
{
	public static void main(String[] args) 
	{
		int num=43,i;

		for (i=1;i<num ;i++)
		{
			if(num==i*(i+1))
			{
				break;
			}
		}

		if(i==num)
		{
			System.out.println("It is not a pronic num");
		}
		else
		{
			System.out.println("It is  a pronic num");
		}
	}
}
