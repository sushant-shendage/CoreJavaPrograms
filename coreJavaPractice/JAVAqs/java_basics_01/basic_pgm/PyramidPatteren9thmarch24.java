class PyramidPatteren9thmarch24 
{
	public static void main(String[] args) 
	{

		int n=7;
		for (int j=1;j<=n;j++ )
		{
			for (int k=1;k<=n/2;k++)
			{
				System.out.print("  ");
			}
			for (int i=1;i<=j;i++ )
			{
				System.out.print("* ");
			}
				System.out.println();
		}
	}
}
