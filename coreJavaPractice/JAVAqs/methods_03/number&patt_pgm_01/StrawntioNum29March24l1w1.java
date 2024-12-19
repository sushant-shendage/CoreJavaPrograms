class StrawntioNum29March24l1w1
{
	public static void main(String[] args) 
	{
		 strontioNum(1230);
	}
	public static void strontioNum(int num)
	{
		if (strontio(num))
		{
			System.out.println(num+" is a strantio num");
		}
		else
		{
			System.out.println(num+" is not a strantio num");
		}
		 
	}
	public static boolean strontio(int num)
	{
		int numx2=num*2,uP=0,tP=0,i;
		 for ( i=numx2;i!=0 ;i/=10 )
		 {
			 if(i>99 && i<=999)
			{
                uP=i%10;
				i/=10;
				tP=i%10;

				break;
			}
		 }

		 return uP==tP;
	}
}
