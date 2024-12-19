class CheckFibNum
{
	public static void main(String[] args) 
	{
		int num1=0,gnum=7,num2=1,sum;

		for (int i=1; i<=gnum;i++ )
		{
			 if(num1==gnum)
			{
				break;
			}
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}

		if(num1==gnum)
		{
			System.out.println("fib number");
		}else
		{
			System.out.println("not fib number");
		}
	}
}
//logic1,logic2(sir's logic) 4th march
/*
For[
if    :N1>gnum print not fib
elseif:N1=gnum print fib

else  :
N3=n1+n2
N1=n2;
N2=n3
]

*/

