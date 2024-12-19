class NthFibValPrimeOrNot
{
	public static void main(String[] args) 
	{
		int fibval=5,num1=0,num2=1,sum,j;
		for (int i=1;i<=fibval-1 ;i++ )
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
		System.out.println(fibval+" position value:"+num1);

		for ( j=2;j<num1 ;j++ )
		{
			if(num1%j==0)
			{break;}
		}

		if(j==num1)
		{
			System.out.println(fibval+" position value:"+num1+" and is prime ");
		}
		else
		{
			System.out.println(fibval+" position value:"+num1+" and is not  prime ");
		}
	}
}
