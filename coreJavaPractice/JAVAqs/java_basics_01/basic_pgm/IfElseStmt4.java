import java.util.Scanner;
class IfElseStmt4

{
	public static void main(String[] args) 
	{
		
		double amount;
		Scanner ScanVar=new Scanner(System.in);

		System.out.print(" Enter your amount :");
		amount=ScanVar.nextDouble();

		if( amount>0 && amount>700000)
			{
			 System.out.println("Pay tax ");
			}
			else
			{
			System.out.println("No tax ");
			}	
	}
}
