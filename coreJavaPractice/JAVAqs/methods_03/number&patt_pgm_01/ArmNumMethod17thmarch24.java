class ArmNumMethod17thmarch24
{
	public static void main(String[] args) 
	{
		
		int num=153;

		armNum(num);
	}

	public static void armNum(int numM)//fx2
	{
		int sum=0;
		int count=count(numM);
		
		 for(int i=numM;i>0;i/=10)
		{
			  
			 mod(i);
			int prod=1;
			 
			 

			 for (int j=1;j<= count ;j++ )
			 {
				 prod*=mod(i);
				 
			 }

			 sum+=prod;

			
		}

		 
		if (sum==numM)
		{
			System.out.println("Result:"+numM+"  is a ArmNum");
		}
		else
		{
			System.out.println("Result:"+numM+"  is not a ArmNum");
		}

	}

	public static int count(int numM)//fx1
	{
		int count=0;
		for (int i=numM;i!=0 ;i/=10 )
		{
			count++;
		}

		 return count;
		
	}

	public static int mod(int num)//fx3
	{
		return num%10;
	}
}
