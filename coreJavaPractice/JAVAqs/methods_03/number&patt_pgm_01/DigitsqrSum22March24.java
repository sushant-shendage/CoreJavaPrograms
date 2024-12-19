class DigitsqrSum22March24 
{
	public static void main(String[] args) 
	{
		digitSqrSum(1234);
	}
	public static void digitSqrSum(int num)
	{
		int sum=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=sqrDigit(i%10);
		}

		System.out.println("sum of digits "+num+" is "+sum);
		
	}
	public static int sqrDigit(int num)
	{
		return num*num;
	}
}
