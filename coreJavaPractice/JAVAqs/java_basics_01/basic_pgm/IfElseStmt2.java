import java.util.Scanner;
class IfElseStmt2

{
	public static void main(String[] args) 
	{
		
		int intVar1;
		Scanner ScanVar=new Scanner(System.in);

		System.out.print(" Enter integer number :");
		intVar1=ScanVar.nextInt();

		if(intVar1%2==0)
			{
			 System.out.println(intVar1+" : is  the even number ");
			}
			else
			{
			System.out.println(intVar1+" : is  the odd number ");
			}	
	}
}
