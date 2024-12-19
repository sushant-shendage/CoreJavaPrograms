class GoodNum5march24_19
{
	public static void main(String[] args) 
	{
		int num=95191;

		 
		  
			int i;
		 for (i=1;i<=Bl.digitCount(num) -1;i++ )
		 {
			 if ((num/Bl.pow(10,i))%10<Bl.digitSum(num%Bl.pow(10,i)))
			 {
				 break;
			 }
		 }

		 if(i==Bl.digitCount(num))
		 {
			System.out.println(num+" is a good number");
		 }
		 else
		{
			System.out.println(num+" is NOT a good number");
		}

	}
}
