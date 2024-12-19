class UglyNum28 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=20 ;i++ )
		{
			uglyNum(i);
		}
	}
	public static void uglyNum(int num)
	{
		if(num==1)
		{
			 System.out.println(num+" is not a ugly num");
		}
		else
		{
		  for (; num!=1; )
		  {
			  if(num%2==0)
			  {
				num/=2;
			  }
			  else if(num%3==0)
			  {
				num/=3;
			  }
			  else if(num%5==0)
			  {
				num/=5;
			  }
			 if(num==1)
			{
				 System.out.println(num+" is a ugly num");
			}
			else
			{
				 System.out.println(num+" is not a ugly num");
			}
		  }

		}
	}
}
