class FacinatingNum29March24w1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			facinatingNum(i);
		}
	}
	public static void facinatingNum(int num)
	{
		if (facinating(num))
		{
			System.out.println(num+" is a Facinating num");
		}
		/*else
		{
			System.out.println(num+" is not a Facinating num");
		}*/
	}

	public static boolean facinating(int num)
	{
		 int num2=num*pow(10,count(num*2))+num*2;
		 int num3=num2*pow(10,count(num*3))+num*3;
		 //System.out.println(num3+" concatinated number");

		 return unique(num3) && count(num3)==9 && duck(num3)==false;
		
	}
	public static int pow(int base,int index)
	{
		int prod=1;
		for (int i=1;i<=index ;i++ )
		{
			prod*=base;
		}
		return prod;
	}
	public static int count(int num)
	{
		int count=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			count++;
		}
		return count;
	}





	 
	public static boolean unique(int num)
	{
		while(num>0)
		{
			if(UN(num/10,num%10))
			{
				num/=10;
			}
			else
			{
				break;
			}
		}

		return num==0;
			 
	}
	public static boolean UN(int num,int last)
	{
		 for (int i=num;i!=0 ;i/=10 )
		 {
			 if(num%10==last)
			{
				break;
			}
			num/=10;
		 }

		return num==0;
			 
	}
	public static boolean duck(int num)
	{
		int i;
		for (i=num;i!=0 ;i/=10 )
		{
			if(i%10==0){break;}
		}

		return i!=0;
	}
}
