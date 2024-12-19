class NthFibVal111
{
	public static void main(String[] args) 
	{
		int fibval=6,num1=0,num2=1,sum;
		for (int i=1;i<=fibval-1 ;i++ )
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
		System.out.println(fibval+" position value:"+num1);
	}
}
