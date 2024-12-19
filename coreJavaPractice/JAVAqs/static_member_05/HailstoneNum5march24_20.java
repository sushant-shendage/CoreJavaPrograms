class HailstoneNum5march24_20
{
	public static void main(String[] args) 
	{
		int num=321,count=0;

		for (;num!=1 ; )
		{
			if (num%2==0)
			 {
				num/=2;
				System.out.print("|num :"+num);
				count++;
				//System.out.println("count :"+count);
			 }
			 else
			 {
				num=num*3+1;
				System.out.print("|num :"+num);
				count++;
				//System.out.println("count :"+count);
			}
		}

		 
	}
}