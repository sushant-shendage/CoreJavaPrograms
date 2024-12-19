class CheckFib 
{
	public static void main(String[] args) 
	{
		checkFib(5);
	}

	public static void checkFib(int num)
	{
		
		int num1 = 0;
		int num2 = 1;
		int nextNum = 0;

		for (int i = 0; num1 <= num ;i++ )
		{
			nextNum = num1 + num2;


			
			

			num1 = num2;
			num2 = nextNum;
			
			if (num1 >= num)
			{
				break;
			}
			
			
		}	

		System.out.println(num1);

		if (num1 == num)
			{
				System.out.println(num + " is Fib number!");
				
			}

		else {
			System.out.println(num + " is Not Fib  number!");
				
		}
	}
}
