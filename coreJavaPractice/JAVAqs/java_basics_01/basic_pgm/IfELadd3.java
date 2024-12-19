import java.util.Scanner;
class IfELadd3

{
	public static void main(String[] args) 
	{
		
		float amount;
		Scanner ScanVar=new Scanner(System.in);

		System.out.println(" Eenter your amount :");
		amount=ScanVar.nextFloat();

		if(amount>=0 && amount<699999)
			{
			 System.out.println("No tax");
			}
			else if (amount>=700000 && amount<1499999)
			{
				System.out.println("Pay 10% tax");
			}
			else if (amount>=1500000 && amount<1999999)
			{
				System.out.println("Pay 20% tax");
			}
			else  
			{
				System.out.println("Pay 25% tax");
			}
			 

		
	}
}