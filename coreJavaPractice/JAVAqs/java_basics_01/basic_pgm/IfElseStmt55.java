import java.util.Scanner;
class IfElseStmt55

{
	public static void main(String[] args) 
	{
		
		int password;
		Scanner ScanVar=new Scanner(System.in);

		System.out.print(" Enter your password:");
		password=ScanVar.nextInt();

		if( password==4578)
			{
			 System.out.println("logged in succesfully !  ;-) ");
			}
			else
			{
			System.out.println("Log in failed :-(");
			}	
	}
}
