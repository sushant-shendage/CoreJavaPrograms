class LycharlNum6thMarch24_25
{
	public static void main(String[] args) 
	{
		//for (int i=1;i<=100 ;i++ )
		//{
			LychralNum(89);
		//}
		 
	}
	public static void LychralNum(int num)
	{
		int c1num=num;
		while(num>0)
		{
			System.out.println("Num : "+num);
			System.out.println("num+Bl.revNum(num):"+(num+Bl.revNum(num)));
			System.out.println("num+Bl.revNum(num):"+(Bl.revNum(num+Bl.revNum(num))));
			if (num+Bl.revNum(num)==(Bl.revNum(num+Bl.revNum(num))))
			{
				
				System.out.println("break; ");
				break;
			}
			
			num=num+Bl.revNum(num);
		}

		if(num<0)
		{
			System.out.println(c1num+" is a Lycharal number");
		}
		else
		{
			System.out.println(c1num+" is not a Lycharal number");
		}
	}
}
//failed try again
