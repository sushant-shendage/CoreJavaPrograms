class FermatsNum30march24l1w1 
{
	public static void main(String[] args) 
	{
		int num=9;
		 for (int i=0;i<=num ;i++ )
		 {
			 System.out.print((pow(2,pow(2,i))+1)+",");
		 }
	}

	public static int pow(int base,int index)
	{
		int prod=1;
		for (int i=1;i<=index ;i++ )
		{
			prod*=base;
		}
		return prod;
	}
}
