class SumAndProdFactOfNum
{
	public static void main(String[] args) 
	{
		int num=43466,facter,sum=0,prod=1;

		for (int i=1;i<num/2 ;i++ )
		{
			if(num%2==0)
			{
				facter=i;
			}
			sum+=facter;
			prod*=facter;
		}

		System.out.println("sum  : "+sum);
		System.out.println("prod : "+prod);

		if(sum==prod)
		{
			System.out.println("Result  :Sum and product are same .");
		}else
		{
			System.out.println("Result  :Sum and product are not same .");
		}
	}
}
