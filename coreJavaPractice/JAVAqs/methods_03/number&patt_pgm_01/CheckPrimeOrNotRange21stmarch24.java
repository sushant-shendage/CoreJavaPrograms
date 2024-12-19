class CheckPrimeOrNotRange21stmarch24 
{
	public static void main(String[] args) 
	{
		 for (int i=100;i<=200 ;i++ )
		 {
			 if (checkPrimeOrNot(i))
			 {
				 System.out.println(i+" is a prime no");
			 }
		 }
	}
	public static boolean checkPrimeOrNot(int num)
	{
		int i;
		for ( i=2;i<num ;i++ )
		{
			if(num%i==0)
			{
				break;
			}
		}

		return i==num;
	}
}