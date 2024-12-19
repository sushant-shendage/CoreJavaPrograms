class  Assignment2march24
{
	public static void main(String[] args) 
	{
		int num1=-456,cnum1,fact,sum1=0,sum2=0,rev=0;
		cnum1=num1;
		System.out.println("Given :"+num1);
		for (int i=1;i<num1 ;i++)
		{
			if (num1%i==0)
			{
				fact=i;
				sum1+=fact;
			}	
		}	 
		if(num1==sum1)
		{	
			while (cnum1>0)
			{
				int mod=cnum1%10;
				rev=rev*10+mod;
				cnum1/=10;
			}
			System.out.println("revnum : "+rev);
			if(rev==num1)
			{
				System.out.println("Palindrom num");
			}
			else
			{
				System.out.println("NOT a Palindrom num");
			}	
		}
		else
		{
			while (num1!=0)
			{
				int mod=num1%10;
				sum2+=mod;
				num1/=10;
			}
			System.out.println("sum : "+sum2);
		}
	}
}
