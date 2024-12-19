import java.util.Scanner;
class IfElseStmt3

{
	public static void main(String[] args) 
	{
		
		char charVar1;
		Scanner ScanVar=new Scanner(System.in);

		System.out.print(" Enter any single charecter :");
		charVar1=ScanVar.next().charAt(0);

		if(charVar1=='a'||charVar1=='A'||charVar1=='e'||charVar1=='E'||charVar1=='i'||charVar1=='I'||charVar1=='o'||charVar1=='O'||charVar1=='u'||charVar1=='U')
			{
			 System.out.println(charVar1+" : is  a vowel ");
			}
			else
			{
			System.out.println(charVar1+" : is  a consonant ");
			}	
	}
}
