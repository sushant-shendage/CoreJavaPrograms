import java.util.Scanner;
class IfELadd2

{
	public static void main(String[] args) 
	{
		
		Scanner ScanVar=new Scanner(System.in);
 
		char charVar1;
		 

		System.out.print(" Enter 0,1,2 for R,Y,G charecter :");
		charVar1=ScanVar.next().charAt(0);
 
		 

		 

		if(charVar1=='R')
			{
			 System.out.println("Stop ! ");
			}
			else if(charVar1=='G' )
			{
			System.out.println(" Go ");
			}	
			else if(charVar1=='Y')
			{
			System.out.println("Be ready to go ");
			}
			else
			{
				System.out.println("Enter valid color ");
			}
			
	}
}