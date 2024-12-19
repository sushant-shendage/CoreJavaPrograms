class CheckFibNumber
{
	public static void main(String[] args) 
	{
		isFib(3);
	}

	public static void isFib(int num)
	{
		int num1 = 0 , num2 = 1, nextNum = 0;
		int i;
		for (i = 0; i <= num ;i++ )
		{
			nextNum = num1 + num2;

			num1 = num2;
			num2 = nextNum;

			if (nextNum >=num)
			{
				break;
			}
		
	   }
	

		if (num == nextNum)
		{
			System.out.println("Fib Number!");
		}
		else
		{
			System.out.println("Not Fib!");
		}
	}
}
