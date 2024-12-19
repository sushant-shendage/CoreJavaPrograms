class NthFibVal
{
	public static void main(String[] args) 
	{
		int fibval=6,num1=0,num2=0,sum;
		for (int i=1;i<=fibval ;i++ )
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
	 System.out.println(fibval+" position value:"+num1);
	}
}
