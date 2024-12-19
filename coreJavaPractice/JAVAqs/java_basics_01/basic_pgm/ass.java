class  ass
{
	public static void main(String[] args) 
	{
		int num=123,cnum1,cnum2;
		int sdigit=0,pdigit;

		cnum1=num;
		cnum2=num;



		while(num>0)
		{
			int numMod=num%10;

			sdigit+=numMod;
			cnum1/=10;
		}

		while(num>0)
		{
			int numMod=num%10;
				if(numMod==0)
				{
					
				}
			pdigit*=numMod;
			cnum2/=10;

		}
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(sdigit==pdigit)
		{
			System.out.println("Entered number's sum and product of digits are equals");		
		}
	}
}
