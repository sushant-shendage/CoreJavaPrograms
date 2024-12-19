class FibSeries22March24 
{
	public static void main(String[] args) 
	{
		 fibSeries(8);
	}
	public static void fibSeries(int num)
	{
		int num1=0,num2=1,sum;

		for (int i=1;i<=num ;i++ )
		{
			System.out.print(num1+",");
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
	}
}
