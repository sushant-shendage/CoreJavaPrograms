class LCM6thmarch02 
{
	public static void main(String[] args) 
	{
		int num1=45,num2=3,big;

		big=(num1>num2)?num1:num2;

		while (true)
		{
			if(num1%big==0||num2%big==0)
			{
				break;
			}
				big++;
		}
		
		System.out.println("The LCM :"+big);
	}
}
 