class GaneshPatteren 
{
	public static void main(String[] args) 
	{
		 for (int i=0;i<=70 ;i++ )
		 {
			 for (int j=0;j<=70 ;j++ )
			 {
				 if(i==1&&j==31||i==1&&j==31||
i==1&&j==32||
i==2&&j==31||
i==2&&j==32||
i==2&&j==33||
i==2&&j==34||
i==3&&j==35||
i==4&&j==34||
i==4&&j==33||
i==4&&j==32||
i==5&&j==35||
i==6&&j==31||
i==5&&j==30){
				System.out.print("* ");	

				 }
				 else{
					System.out.print("  ");
				 }
				  
			 }
			System.out.println(); 
		 }
	}
}
