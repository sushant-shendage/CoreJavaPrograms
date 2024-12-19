import java.util.Scanner;
class Scanner1 
{
	public static void main(String[] args) 
	{
		 Scanner ScanVar=new Scanner(System.in);

		//System.out.print("Enter the byte-integer number :");
		//byte byteVar=ScanVar.nextByte();
		//System.out.println("Entered byte-integer value :"+byteVar);
		
		//System.out.print("Enter the short-integer number :");
		//short shortVar=ScanVar.nextShort();
		//System.out.println("Entered short-integer value :"+shortVar);
		
		//System.out.print("Enter the integer number :");
		//int intvar=ScanVar.nextInt();
		//System.out.println("Entered integer value :"+intvar);
		
		//System.out.print("Enter the long-integer number :");
		//long longVar=ScanVar.nextLong();
		//System.out.println("Entered Long-integer value :"+longVar);
		
		//System.out.print("Enter the float number :");
		//float floatVar=ScanVar.nextFloat();
		//System.out.println("Entered float value :"+floatVar);
		
		//System.out.print("Enter the double number :");
		//double doubleVar=ScanVar.nextDouble();
		//System.out.println("Entered double value :"+doubleVar);
		
		//System.out.print("Enter the boolean number :");
		//boolean booleanVar=ScanVar.nextBoolean();
		//System.out.println("Entered boolean value :"+booleanVar);
		
		System.out.print("Enter the string without spaces :");
		String stringVar=ScanVar.next();
		System.out.println("Entered string :"+stringVar);

		System.out.print("Enter the string with spaces :");
		String stringVar2 = ScanVar.nextLine();
		System.out.println("Entered string2 :"+stringVar2);

	}
}
