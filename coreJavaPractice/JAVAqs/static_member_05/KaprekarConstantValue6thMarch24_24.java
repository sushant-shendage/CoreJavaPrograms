class KaprekarConstantValue6thMarch24_24
{
	public static void main(String[] args) 
	{
		int num=1234;

		 while (num!=6174)
		 {
			 if(digitAsend(num)-digitDesend(num)<0)
			 {
				break;
			 }
			  num=digitAsend(num)-digitDesend(num);
		 }
	}
}
