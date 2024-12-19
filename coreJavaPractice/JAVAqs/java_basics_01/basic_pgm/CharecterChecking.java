import java.util.Scanner;

class CharecterChecking
{
	public static void main(String[] args) 
	{
		Scanner ScanVar= new Scanner(System.in);

while(true)
	{
		System.out.print("\n Enter the charecter : ");
		char charVar=ScanVar.next().charAt(0);

		System.out.print("Charecter : "+charVar);

		if((charVar>='A' && charVar<='Z')||(charVar>='a' && charVar<='z'))
		{
			System.out.print("\n"+charVar+" charecter is 'Alphabet'.");
			if(charVar>='A' && charVar<='Z')
				{
					System.out.println("\nUppercase charecter");
				}
				else
				{
					System.out.println("\nLowercase charecter");
				}
		}
		else if (charVar>='0' && charVar<='9')
		{
			System.out.print("\n"+charVar+" charecter is 'Digit'.");
		}
		else 
		{
			System.out.print("\n"+charVar+" charecter is 'Special charecter'.");
		}

	}
	}
}
