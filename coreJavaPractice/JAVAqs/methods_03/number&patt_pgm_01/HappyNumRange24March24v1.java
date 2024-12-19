class HappyNumRange24March24v1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=50 ;i++ )
		{
			happyNum(i);
		}
		
	}
	public static void happyNum(int num)
	{
		if(happy(num))
		{
			System.out.println("happy num :"+num);
		}
		 
	}

	public static boolean happy(int num)
	{
		int sum;
		while(true)
		{
			 sum=0;
			for (int i=num;i!=0 ;i/=10 )
			{
				sum+=digitSqr(i%10);
			}
				num=sum;
				if(num==4 ||num==1 )
			    {
					break;
			    }
		}

			if(num==1)
			{
				return true;
			}
			else
			{
				return false;
			}
		
				 
	}

	public static int digitSqr(int num)
	{
		return num*num;	
	}
}
