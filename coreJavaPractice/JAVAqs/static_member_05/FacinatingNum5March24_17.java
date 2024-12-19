class FacinatingNum5March24_17
{
	public static void main(String[] args) 
	{
		int num=193;
		int num1=num,num2=num*2,num3=num*3;


		 if (Bl.digitCount(num1)==3 && Bl.digitCount(num2)==3 && Bl.digitCount(num3)==3 )
		 {
			 num1=num*Bl.pow(10,6);
			 num2=num1+num2*Bl.pow(10,3);
			 num3=num2+num3;

			 int digitAsend=0,Td=Bl.digitCount(num3),dGroup=Bl.dGroup(2,Bl.dCount(2,num3));
		
	//System.out.println("Bl.dGroup(2,Bl.dCount(2,num))) : "+Bl.dGroup(2,Bl.dCount(2,num)));
	//System.out.println("Td=Bl.digitCount(num)          : "+Td);

	for (int i=1;i<=9&&Td>0 ;i++ )
	{
		if(Bl.dCount(i,num3)>1)
		{
			digitAsend+=dGroup*Bl.pow(10,(Td-Bl.dCount(i,num3)));
			Td-=Bl.dCount(i,num3);
		}
		else if(Bl.dCount(i,num3)==1)
		{
			digitAsend+=i*Bl.pow(10,(Td-1));
			Td--;
		}
		
	}
		
	 if (digitAsend==123456789)
	 {
		 System.out.println(num+" is facinating number");
	 }
	 else
	{
		 System.out.println(num+" is not a facinating number");
	}
		 }
	}
}
