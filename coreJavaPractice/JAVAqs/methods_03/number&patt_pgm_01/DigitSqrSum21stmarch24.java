class DigitSqrSum21stmarch24
{
	public static void main(String[] args) 
	{
		 int num=12345,sum=0;

		 for (int i=num;i!=0 ;i/=10 )
		 {
			 sum+=DigitSqr(i%10);
		 }

		 System.out.println("the of digit's square :"+sum);
	}
	public static int DigitSqr(int num)
	{
		return num*num;
	}
}
