class DuckNum 
{
	public static void main(String[] args) 
	{
		int num=12345;
		while (num>0)
		{
			int  mod=num%10;
			if(mod==0)
			{
		
				break;
			}
			num/=10;

		}

		if(num!=0)
		{
			System.out.println("Duck num");
		}
		else
		{
			System.out.println("not a Duck num");
		}



		}

}
