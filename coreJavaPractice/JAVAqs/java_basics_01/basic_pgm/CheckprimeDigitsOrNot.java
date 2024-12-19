class CheckprimeDigitsOrNot
{
	public static void main(String[] args) 
	{
		int num=235,alldigit=1,i=1;

		while(num>0)
		{
			int mod=num%10;
			
			while(i<=mod)
			{
				if(mod==i)
				{
					break;
				}
				i++;
			}
			if(i!=mod)
			{
				alldigit=0;
				 break;
				 
			}
			num/=10;
			 
		}

		if(alldigit==0)
		{
			System.out.println("all digits are not prime");
		}
		else
		{
			System.out.println("all digits are  prime");
		}
 
	}
}
