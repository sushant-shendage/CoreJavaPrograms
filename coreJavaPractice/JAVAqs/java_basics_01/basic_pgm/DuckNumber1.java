class DuckNumber1 
{
	public static void main(String[] args) 
	{
		int number=2034;
		
		while (number>0)
		{
			int mod=number%10;
			if (mod==0)
			{
				break;
			}
			number/=10;
		}
		
		
		
		if (number!=0)
		{
			System.out.println("It is a Duck :");
		}
		else
		{
			System.out.println("It is not Duck Number");
			
		}
	}
}
