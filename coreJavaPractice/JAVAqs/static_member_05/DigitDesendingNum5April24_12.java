class DigitDesendingNum5April24_12
{
	public static void main(String[] args) 
	{
		digitAsend(380660);
	 	 
	}
	public static void digitAsend(int num)
	{
		int digitAsend=0,Td=Bl.digitCount(num);
		
	System.out.println("Bl.dGroup(2,Bl.dCount(2,num))) : "+Bl.dGroup(2,Bl.dCount(2,num)));
	System.out.println("Td=Bl.digitCount(num)          : "+Td);

	for (int i=1;i<=9&&Td>0 ;i++ )
	{
		if(Bl.dCount(i,num)>1)
		{
			digitAsend+=Bl.dGroup(i,Bl.dCount(i,num)*Bl.pow(10,(Td-Bl.dCount(i,num))));
			Td-=Bl.dCount(i,num);
		}
		else if(Bl.dCount(i,num)==1)
		{
			digitAsend+=i*Bl.pow(10,(Td-1));
			Td--;
		}
		
	}
		
	//System.out.println("Asend digit of "+num+": "+Bl.revNum(digitAsend)*Bl.pow(10,Bl.dCount(0,num)));
	System.out.println("Asend digit of "+num+": "+digitAsend);

		
	}
} 