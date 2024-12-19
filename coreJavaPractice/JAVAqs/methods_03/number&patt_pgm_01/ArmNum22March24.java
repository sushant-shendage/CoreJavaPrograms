class ArmNum22March24 
{
	public static void main(String[] args) 
	{
		 ArmNum(153);
	}

	public static void ArmNum(int num)
	{
		 int count=countNum(num),sum=0;

		 for (int i=num;i!=0 ;i/=10 )
		 {
			 sum+=pow(i%10,count);
		 }
		 if(armOrNot(sum,num))
		{
			System.out.println(num+" is a armstrong num");
		}
		else
		{
			System.out.println(num+" is not a armstrong num");
		}
		 
	}
	public static int countNum(int num)
	{
		int count=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			count++;
		}

		return count;
	}
	public static int pow(int base,int power)
	{
		int prod=1;
		for (int i=1;i<=power ;i++ )
		{
			prod*=base;
		}
		return prod;
	}

	public static boolean armOrNot(int sum,int num)
	{
		return sum==num;
	}
}
