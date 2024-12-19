class PronicNumRange7thmarch24
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=100;j++)
		{
		int num=j,i;

		for (i=1;i<num ;i++)
		{
			if(num==i*(i+1))
			{
				break;
			}
		}

		if(i!=num)
		{
			System.out.println(" pronic num : "+num);
		}
		 
		}
	}
}
