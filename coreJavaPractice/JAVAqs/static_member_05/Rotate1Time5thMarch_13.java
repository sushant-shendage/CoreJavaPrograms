class Rotate1Time5thMarch_13 
{
	public static void main(String[] args) 
	{
		 int num=1234;

		  System.out.println("num : "+num);

		 int rotate1= num%10*Bl.pow(10,Bl.digitCount(num/10))+num/10;

		 System.out.println("rotate1 : "+rotate1);
	}
}
