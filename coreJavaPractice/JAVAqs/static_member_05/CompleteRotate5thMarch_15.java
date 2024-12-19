class CompleteRotate5thMarch_15
{
	public static void main(String[] args) 
	{
		 int num=31,c1num=num;

		  System.out.println("num : "+num);


	 if (Bl.prime(num))
	 {
		 do
		 {
			 num=num%10*Bl.pow(10,Bl.digitCount(num/10))+num/10;
			 if (Bl.prime(num))
			 {
			 }
			 else
			 {
				 break;
			 }
		 }
		 while (num!=c1num);

		 if (c1num==num)
		 {
			System.out.println(num+" is  a rotating prime number");
		 }
		 else
		{
			System.out.println(num+" is NOT  a rotating prime number");
		}

	}
	 else
	{
		System.out.println(num+" is not a prime number");
	}

	}
}
