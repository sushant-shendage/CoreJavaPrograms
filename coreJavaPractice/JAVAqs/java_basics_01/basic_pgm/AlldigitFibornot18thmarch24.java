class AlldigitFibornot18thmarch24 
{
	public static void main(String[] args) 
	{
		 int num=1235;
		int count=0;
		 for (int i=num;i!=0 ;i/=10 )
		 {
			int mod=i%10;
			
			int num1=0,num2=1,sum;
			for (int j=1;j<=mod ;j++ )
			{
				sum=num1+num2;
				 System.out.println("sum :"+sum);
				 if(num1==mod)
				{
					count++;
					System.out.println("count in loop :"+count);
					
				}
				num1=num2;
				 System.out.println("num1 :"+num1);
				num2=sum;
				 System.out.println("num2 :"+num2);

				
				
			}
		 }

		 System.out.println("count :"+count);
	}

}
//4123