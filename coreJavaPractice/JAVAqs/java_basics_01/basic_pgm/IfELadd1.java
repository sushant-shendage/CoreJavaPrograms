import java.util.Scanner;
class IfELadd1

{
	public static void main(String[] args) 
	{
		
		Scanner ScanVar=new Scanner(System.in);
 
		char charVar1;
		 

		System.out.print(" Enter any single charecter :");
		charVar1=ScanVar.next().charAt(0);
 
		 

		 

		if((int)charVar1>=97 && (int)charVar1<=122  )
			{
			 System.out.println(charVar1+" : is  a lower case alphabet ");
			}
			else if((int)charVar1>=65 && (int)charVar1<=91 )
			{
			System.out.println(charVar1+" : is  a Upper case alphabet ");
			}	
			else if((int)charVar1>=48 && (int)charVar1<=57)
			{
			System.out.println(charVar1+" : is  a digit ");
			}
			else
			{
				System.out.println(charVar1+" : is  a special charecter ");
			}
			
	}
}
