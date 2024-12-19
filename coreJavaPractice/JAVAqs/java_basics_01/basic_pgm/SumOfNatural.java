class SumOfNatural 
{
	public static void main(String[] args) 
	{
		int num=10;
		int start=1;
		int sum1=0;
		int sum2=num*(num+1)/2;

		while (start<=num)
		{
			sum1=sum1+start;
			start++;
		}
		System.out.println(sum1);
		System.out.println("sum2: "+sum2);
	}
}
