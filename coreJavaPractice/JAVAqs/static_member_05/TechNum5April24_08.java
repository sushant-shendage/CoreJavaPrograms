class TechNum5April24_08
{
	public static void main(String[] args) 
	{
		 int num=2025,c1num=num;
		 int Fh=num%Bl.pow(10,Bl.digitCount(num)/2);
		 num/=Bl.pow(10,Bl.digitCount(num)/2);
		 int Sh=num;

		 int hAdd=Fh+Sh;
		 

		 if(hAdd*hAdd==c1num)
		 {
			System.out.println(c1num+" is a Tech number");
		 }
		 else
		 {
			System.out.println(c1num+" is NOT a Tech number");
		 }
	}
} 