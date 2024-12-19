class Zero 
{
	public static void main(String[] args) 
	{
		 int num=1234,zero=0;

		 while(num>0)
		 {
			 int numMod=num%10;

			 if(numMod==0)
			{
				zero=1;
			}
			 
		 }

		 if(zero==1)
		 {
			System.out.println("Result : Given string contains zero");
		 }
		 if(zero==0)
		 {
			System.out.println("Result : Given string not contains zero");
		 }
		  
	}
}
