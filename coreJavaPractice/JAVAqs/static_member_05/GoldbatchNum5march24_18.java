class GoldbatchNum5march24_18
{
	public static void main(String[] args) 
	{ 
		int num=13,flag=0;

		 for (int i=3;i<=num ;i++ )
		 {
			 if (Bl.prime(i))
			 {
				  for (int j=3;j<=num ;j++ )
				 {
					if(Bl.prime(j))
					{
						if (i+j==num)
						{
							flag=1;
							break;
						}
					}
				 }
			 }

			 if (flag==1)
			 {
				 break;
			 }
			
		 }
	if (flag==1)
	{
		System.out.println(num+" is a goldbatch number");
	}
	else
	{
		System.out.println(num+" is NOT a goldbatch number");
	}
		 

		
	}
}
