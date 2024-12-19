class PrimeNum01_24_03_24 
{
	public static void main(String[] args) 
	{
		int num=13,i=2;

		


		while (i<(num/2))
		{
			if (num%i==0)
			{
				break;
			}
			i++;
		}


		if (i==(num/2))
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("NOT a Prime number");
		}

	}
}
