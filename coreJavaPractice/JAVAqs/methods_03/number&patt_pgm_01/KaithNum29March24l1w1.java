class KaithNum29March24l1w1
{
	public static void main(String[] args) 
	{
		kaithNum(198); 
	}

	public static  void kaithNum(int num)
	{
		 if (kaith(num))
		 {
			 System.out.println(num+" is a kaith num");
		 }
		 else
		 {
			System.out.println(num+" is not a kaith num");
		 }
	}

	public static  boolean kaith(int num)
	{
		int num3=num%10,num2=(num/10)%10,num1=(num/100)%10,sum=0;
		
		//System.out.println("num1 :"+num1);
		//System.out.println("num2 :"+num2);
		for (;sum<=num; )
		{
			sum=num1+num2+num3;
			//System.out.println("sum :"+sum);
			if(sum==num || sum>num)
			{
				break;
			}
				num1=num2;
				num2=num3;
				num3=sum;
		}

		return sum==num;
	}

	 
}
// program will find 3 digit kaith numbers only
