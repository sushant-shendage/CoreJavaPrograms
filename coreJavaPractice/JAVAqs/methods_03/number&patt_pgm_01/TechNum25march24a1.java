class TechNum25march24a1 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10000 ;i++ )
		{
			 techNum(i);
		}
		
		 
	}
	public static void techNum(int num)
	{
		int count=count(num);
		if(count%2==0)
		{
			if(tech(num))
			{
				System.out.println(num+" is a tech num");
			}
			/*else
			{
				System.out.println(num+" is not a tech num");
			}*/
			
		}
		/*else
		{
			System.out.println(num+" is not a tech num");
		}*/
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

	public static boolean tech(int num) 
	{
		int index=count(num)/2;
		int sum=0;

		for (int i=num;i!=0 ;i/=pow(10,index) )
		{
			sum+=i%(pow(10,index));
		}
		 
		return sum*sum==num;
		
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



}
