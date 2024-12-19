class CheckPrimeNumWithinRange02_7thmarch24 
{
	public static void main(String[] args) 
	{
		 int start=1,end=100;

		 for(int i=end;i>start;i--)
		 {//for loop1 start
			int num=i;
			int j;
			 for (j=2;j<num ;j++ )
			 {//for loop2 start
				 if(num%j==0){break;}

			 }//for loop2 end

			 if(j==num)
			 {
				System.out.println("prime :"+num);
			 }
		 }//for loop1 end
	}
}