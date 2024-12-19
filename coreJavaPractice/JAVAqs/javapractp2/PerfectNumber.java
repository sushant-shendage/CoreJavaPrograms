class PerfectNumber 
{
	public static void main(String[] args) 
	{
		isParfect(504);	
	}

	public static void isParfect(int num)
	{
		int sum = 0;

		for (int i = 1; i <= num / 2  ; i++)
		{
			if (num % i == 0)
			{
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		if (sum == num)
		{
			System.out.println(num + " is a Perfect Number!");
		}
		else if (sum < num)
		{
			System.out.println(num + " is a deficient Number!");
		}
		else 
		{
			System.out.println(num + " is Abandant Number!");
		}
	}
}
