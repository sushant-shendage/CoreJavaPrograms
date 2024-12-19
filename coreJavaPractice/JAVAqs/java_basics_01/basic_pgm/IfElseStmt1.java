import java.util.Scanner;
class IfElseStmt1

{
	public static void main(String[] args) 
	{
		
		float floatVar1;
		Scanner ScanVar=new Scanner(System.in);

		System.out.println(" Eenter your percentage :");
		floatVar1=ScanVar.nextFloat();

		if(floatVar1>=35)
			{
			 System.out.println("You have passed the exam. :-) ");
			}
			else
			{
			System.out.println("You have failed the exam .:-(");
			}
				
				
				


		
	}
}
