class GoodNum29March24l1w1
{
	public static void main(String[] args) 
	{
		 goodNum(1234);
		 //good(1234);
	}
	public static void goodNum(int num)
	{
		 if (good(num))
		 {
			 System.out.println(num+" is good num");
		 }
		 else
		{
			System.out.println(num+" is not a good num");
		}
	}
	public static boolean good(int num)
	{
		int i;
		for (i=num;i!=0 ;i/=10 )
		{
			if((num%(i%10))!=0)
			{
				//System.out.println("num not divisible by  "+i%10);
				break;
			}
			//System.out.println("num in loop: "+num);
		}
		
		return i==0;
	}
}
