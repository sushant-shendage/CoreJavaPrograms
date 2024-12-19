class KaithNum5march24_22
{
	public static void main(String[] args) 
	{
		int num=198;
		int n3=num%10,n2=(num/10)%10,n1=(num/100)%10,sum=0;

		while (n3!=num ||n3<0)
		{
			sum=n1+n2+n3;
			System.out.println(sum+"  :sum");
			n1=n2;
			System.out.println(n1+"  :n1");
			n2=n3;
			System.out.println(n2+"  :n2");
			n3=sum;
			System.out.println(n3+"  :n3");
			System.out.println("-----------------------");
		}

			if (n3==num)
			{
				System.out.println(num+" is a Kaith number");
			}
			else if(n3<0)
			{
				System.out.println(num+" is NOT a Kaith number");
			}

		
	}
}