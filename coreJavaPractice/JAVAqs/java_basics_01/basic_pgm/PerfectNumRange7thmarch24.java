class PerfectNumRange7thmarch24 
{
	public static void main(String[] args) 
	{
		

		 for (int i=1;i<=100 ;i++ )
		 {
			 int sum=0,num=i;


			 for (int j=1;j<num ;j++ )
			 {
				 if(num%j==0)
				 {
					 sum=sum+j;
				 }
			 }

			 if(num==sum)
			 {
				System.out.println("perfect num : "+num);
			 }
		 }

		 
	}
}
