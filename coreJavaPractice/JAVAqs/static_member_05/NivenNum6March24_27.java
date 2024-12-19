class NivenNum6March24_27
{
	public static void main(String[] args) 
	{
		int num=12;
		if (num%Bl.digitSum(num)==0)
		{
			System.out.println(num+" is a niven number");
		}
		else
		{
			System.out.println(num+" is NOT a niven number");
		}
	}
}
