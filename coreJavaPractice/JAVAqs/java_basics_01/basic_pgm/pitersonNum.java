class PitersonNum
{
	public static void main(String[] args) 
	{
		 int num=0,c1num,factsum=0;
		 c1num=num;

		 while(c1num>=0)
		 {
			int mod=c1num%10;

			int fact=1;
			for (int i=1;i<=mod ;i++ )
			{
				fact=fact*i;
			}
			//System.out.println("fact calculated: "+fact);
			 factsum=factsum+fact;
			//System.out.println("factsum in loop: "+factsum);
if(c1num==0){break;}
			c1num/=10;
		 }

		 System.out.println("factsum : "+factsum);
	}
}
//num=sum(digi!)