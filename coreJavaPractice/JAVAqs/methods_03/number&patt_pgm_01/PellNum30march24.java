class PellNum30march24 
{
	public static void main(String[] args) 
	{
		 pellNum(7);
	}
	public static void pellNum(int num)
	{
		int p1=0,p2=1,pn;

		for (int i=1;i<=num ;i++ )
		{
			pn=2*p2+p1;
			System.out.print(p1+",");
			p1=p2;
			p2=pn;

		}
		
	}
}
