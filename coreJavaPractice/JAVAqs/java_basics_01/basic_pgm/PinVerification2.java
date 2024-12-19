import java.util.Scanner;
class PinVerification2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int savedPin = 1234;
		int limit = 3;
		int attempt = 0;
		do
		{
			System.out.print("Enter Your Pin: ");
			int pin = sc.nextInt();
			if (pin == savedPin)
			{
				System.out.println("Login Successful!");
				break;
			}
			attempt++;
			if(attempt!=limit)
			{
					System.out.println("Remaining Attempts : "+(limit-attempt));
			}
			else
			{
				System.out.println("You have reached max limit ");
			}

			  
		}while (attempt < limit);

		 
	}
}
