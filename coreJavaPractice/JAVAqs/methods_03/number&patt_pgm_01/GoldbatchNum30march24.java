class GoldbatchNum30march24 
{
	public static void main(String[] args) 
	{
		goldbatchNum(12);
	}
	 public static void goldbatchNum(int num)
	{
		 int flag=0;
		 int prime=3;
		 while(prime<=num)
		 {
			for (int i=4 ;i<8 ;i++ )
			{
				 if (nextPrime(i)+prime==num)
				{
					 flag=1;
					 break;
				 }
			}
			if(flag==1)
			{
				break;
			}

			prime=nextPrime(prime+1);
		}
		if (flag==0)
		{
			System.out.println(num+" is not a goldbatch num");
		}
		else
		{
			System.out.println(num+" is a goldbatch num");
		}
	}
	public static int nextPrime(int num)
	{
		while(true)
		{
			if(checkPrime(num))
			{
				break;
			}
			num++;
		}

		return num;
		
	}
	public static boolean checkPrime(int num)
	{
		int i;
		for ( i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				break;
			}
			
		}
		return i==num;
	}

}
