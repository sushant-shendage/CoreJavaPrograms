class TypeCastingFloat
{
	public static void main(String[] args) 
	{
		float floatvar=78.77f;

		byte bytevar;
		//bytevar=floatvar;
		 /*incompatible types: possible lossy 
		 conversion from float to byte*/
		
		
		short shortvar;
		//shortvar=floatvar;
		/* incompatible types: possible 
		lossy conversion from float to short*/
		
		int intvar;
		//intvar=floatvar;
		/* incompatible types: possible lossy conversion 
		from float to int*/

		long longvar;
		//longvar=floatvar;
		/* incompatible types: possible lossy conversion from
		float to long*/

		
		double doublevar;
		doublevar=floatvar;

		char charvar;
		//charvar=floatvar;
		/*incompatible types: possible lossy conversion 
		from float to char*/
		 
		boolean booleanvar;
		//booleanvar=floatvar;
		/* incompatible types: float cannot 
		be converted to boolean*/
	 
		

		System.out.println("float variable   : "+floatvar);
		//System.out.println("float in short   : "+shortvar);
		//System.out.println("float in int     : "+intvar);
		//System.out.println("float in long    : "+longvar);
		//System.out.println("float in byte    : "+bytevar);
		System.out.println("float in double  : "+doublevar);
		//System.out.println("float in char    : "+charvar); 
		//System.out.println("float in double  : "+charvar);
		
	}
}
