class UglyNum6March24_26
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=100 ;i++ )
		{
			int num=i,c1num=num;

			if (i==1)
			{
				System.out.println(c1num+" is NOT a ugly number");
			}
			else
			{
				while (num!=1)
		{
			if(Bl.divisible(num,2))
			{
				num/=2;
			}
			else if (Bl.divisible(num,3))
			{
				num/=3;
			}
			else if (Bl.divisible(num,5))
			{
				
				num/=5;
			}
			else
			{
				System.out.println("break;");
				break;
			}

			System.out.println(num+" num");
		}

		if (num==1)
		{
			System.out.println(c1num+" is a ugly number");
		}
		else
		{
			System.out.println(c1num+" is NOT a ugly number");
		}
		
		}
		
			}
		
	}
}
