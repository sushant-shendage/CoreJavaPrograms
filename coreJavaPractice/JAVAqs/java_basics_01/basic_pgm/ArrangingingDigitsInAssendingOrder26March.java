class DigitsInAssendingOrder26March 
{
	public static void main(String[] args) 
	{
		long num=7709674857;
	  System.out.println("total number of digits in count :"+totalDigits(num));
	}

	public static int totalDigits(int num)
	{
		int total_digits=0;
		 for (int i=num;i!=0 ;i/=10 )
		 {
			total_digits++;
		 }
			return totalDigits;
	}
	 
}
