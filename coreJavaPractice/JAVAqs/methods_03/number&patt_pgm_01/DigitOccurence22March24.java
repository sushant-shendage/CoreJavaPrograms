class DigitOccurence22March24 
{
	public static void main(String[] args) 
	{
		EachDigitOcc(364363,6);
	}
	public static void EachDigitOcc(int num,int digit)
	{
		int count=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			 if(i%10==digit)
			 {
				count++;
			 }
		}
		 System.out.println("The occurence of "+digit+" in number "+num+" :"+count);
	}
}
