class Rotate1Digit22March24 
{
	public static void main(String[] args) 
	{
		 rotateNum(4534);
	}

	public static void rotateNum(int num)
	{
		int mod=num%10;
		num/=10;
		System.out.println( mod*pow(10,count(num))+num);
	}
	public static int count(int num)
	{
		int count=0;
		for (int i=num;i!=0;i/=10 )
		{
			count++;
		}
		return count;
	}
	public static int pow(int base ,int index)
	{
		int prod=1;
		for (int i=1;i<=index ;i++ )
		{
			prod*=base;
		}
		return prod;
	}
}
