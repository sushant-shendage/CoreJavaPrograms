class CheckprimeDigitsOrNot2
{
	public static void main(String[] args) 
	{
		int num=234,mod;

		while(num>0)
		{
			 mod=num%10;
		
			if(mod!=2||mod!=3||mod!=5||mod!=7)
			{
				 break;
			}
			num/=10;
			 
		}

		if(mod!=2||mod!=3||mod!=5||mod!=7)
		{
			System.out.println("all digits are not prime");
		}
		else
		{
			System.out.println("all digits are  prime");
		}
 
	}
}
//TRY 6th march