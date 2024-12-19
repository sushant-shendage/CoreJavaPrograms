class BouncyNum29March24w1 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=20 ;i++ )
		{
			System.out.println("bouncy num: "+bouncyNum(i)+i);
		}
		
	}
	public static boolean bouncyNum(int num)
	{
		int icount=0,dcount=0;

		for (int i=num;i>=9;i/=10 )
		{
			if(num%10>(num/10)%10)
			{
				icount++;	
			}
			else if(num%10<(num/10)%10)
			{
				dcount++;	
			}
		}
		 return icount==count(num)-1 || dcount==count(num)-1;
		
	}
	public static int count(int num)
	{int count=0;
	for (int i=num;i!=0 ;i/=10 )
	{
		count++;
	}
		return count;
	}
}
