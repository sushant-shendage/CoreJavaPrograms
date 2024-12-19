class PerfectNum20thmarch
{
	public static void main(String[] args) 
	{
		 perfect(6);
	}

	public static void perfect(int numM)
	{
		 int sum=sumCal(numM);
		if (sum==numM)
		{
			System.out.println(numM+" is perfect number");
		}
		else
		{
			System.out.println(numM+" is not a perfect number");
		}
	}

	public static int sumCal(int numM)
	{
		int sum=0;

		for (int i=1;i<=numM/2;i++ )
		{
			sum+=i;
		}

		return sum;
	}
}
