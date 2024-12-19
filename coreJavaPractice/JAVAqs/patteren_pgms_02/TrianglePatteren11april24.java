class TrianglePatteren11april24 
{
	public static void main(String[] args) 
	{
		rightApatt(9);	 
		 
	}
	public static void rightApatt(int num)
	{
		 for (int i=1;i>=num;i++)
		 {
			 for (int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			  System.out.println();
		 }
	}

}
