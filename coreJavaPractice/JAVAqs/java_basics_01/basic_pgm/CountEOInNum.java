class CountEOInNum 
{
	public static void main(String[] args) 
	{
		 int num=1234,ecount=0,ocount=0 ;

		 while(num>0)
		 {
			int numMod=num%10;
            
			if(numMod%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
 
			num/=10;
		 }
		 System.out.println("Even digit's count :"+ecount);
		 System.out.println("Odd digit's count  :"+ocount);
	}
}
