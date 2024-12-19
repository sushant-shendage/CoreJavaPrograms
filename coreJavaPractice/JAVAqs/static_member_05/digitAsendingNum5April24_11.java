class digitAsendingNum5April24_11
{
	public static void main(String[] args) 
	{
		digitAsend(12304050);
	  
	}

	public static void digitAsend(int num)
	{
		int digitAsend=0,Td=Bl.digitCount(num),dGroup=Bl.dGroup(2,Bl.dCount(2,num));
		
	//System.out.println("Bl.dGroup(2,Bl.dCount(2,num))) : "+Bl.dGroup(2,Bl.dCount(2,num)));
	//System.out.println("Td=Bl.digitCount(num)          : "+Td);

	for (int i=1;i<=9&&Td>0 ;i++ )
	{
		if(Bl.dCount(i,num)>1)
		{
			digitAsend+=dGroup*Bl.pow(10,(Td-Bl.dCount(i,num)));
			Td-=Bl.dCount(i,num);
		}
		else if(Bl.dCount(i,num)==1)
		{
			digitAsend+=i*Bl.pow(10,(Td-1));
			Td--;
		}
		
	}
		
	System.out.println("Asend digit of "+num+": "+digitAsend);	
		
	}
} 