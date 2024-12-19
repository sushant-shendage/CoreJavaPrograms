class DecToBin30March24 
{
	public static void main(String[] args) 
	{
		 decToBin(10);
		 binToDec(1010);
		  decToOct(10);

	}
	public static void decToBin(int num)
	{
		int c1num=num;
		String bin=" "; 
		while (num!=0)
		{
			bin=num%2+bin;

			num/=2;
		}

		System.out.println(c1num+" in binary : "+bin);
	}
	public static void decToOct(int num)
	{
		int c1num=num;
		String bin=" "; 
		while (num!=0)
		{
			bin=num%8+bin;

			num/=8;
		}

		System.out.println(c1num+" in octal : "+bin);
	}
	public static void binToDec(int num)
	{
		int j=0,sum=0,i;
		 for (i=num;i!=0 ;i/=10 )
		 {
			 sum+=(i%2)*pow(2,j);
			 j++;
		 }

		System.out.println(num+" in decimal : "+sum);
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
