class PalindromicEvenOrNot21stmarch24 
{
	public static void main(String[] args) 
	{
		 int num=212;
		 int rev=revNum(num);

		 if(checkPalindrom(num)&&checkEven(rev))
		 {
			System.out.println(num+" is a palindromic even number");
		 }
		 else
		{
			System.out.println(num+" is not a palindromic even number");
		}
	}
	public static int revNum(int num)
	{
		int rev=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		
		return rev;
	}

	public static boolean checkPalindrom(int num)
	{
		int rev=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+i%10; 
		}

		return rev==num;
		
	}

	public static boolean checkEven(int num)
	{
		 
		return num%2==0;
		
	}


}
