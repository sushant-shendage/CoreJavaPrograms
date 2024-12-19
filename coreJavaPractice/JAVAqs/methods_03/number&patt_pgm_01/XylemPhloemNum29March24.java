class XylemPhloemNum29March24
{
	public static void main(String[] args) 
	{
			xylemPhloemNum(3436); 
	}

	public static void xylemPhloemNum(int num)
	{
		int c1num=num;
	 int sumED=num%10,sumMD=0,i;
	 //System.out.println("sumED :"+sumED);
	 num/=10;
	 //System.out.println("num/=10 :"+num);
	 for (i=num;i>9 ;i/=10 )
	 {
		 sumMD+=i%10;
		 //System.out.println("sumMD:"+sumMD);
		 //System.out.println("i in loop (num):"+i);
	 }
	 sumED+=i%10;
	 //System.out.println("sumED :"+sumED);


	 if (sumED==sumMD)
	 {
		System.out.println(c1num+" is a  xylem  num");
	 }
	 else
	 {
		System.out.println(c1num+" is a  phloem  num");
	 }
	}
}
