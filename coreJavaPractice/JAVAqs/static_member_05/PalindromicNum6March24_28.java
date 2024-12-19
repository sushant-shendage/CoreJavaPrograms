class PalindromicNum6March24_28
{
	public static void main(String[] args) 
	{
		int num=12;
		 if (num%2==0)
		 {
			 if (num==Bl.revNum(num))
			 {
				 System.out.println(num+" is palindromic even number");

			 }
			 else
			{
				System.out.println(num+" is even number");
			}

		 }
		else
		{
			System.out.println(num+" is Odd number");
		}
	}
}
