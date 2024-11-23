// package javapgms.oops.encapsulation;

public class Driver1 {
	public static void main(String[] args) {
		GameUser user=new GameUser();

            System.out.printf("\nuserID       : %s",user.userID      );
            System.out.printf("\nrank         : %d",user.rank        );
            System.out.printf("\nhighestScore : %d",user.highestScore);
            System.out.printf("\npassword     : %d\n",user.password  );
             

          
	}
    
}

class GameUser{
	
      String userID="7yt587t8";
      int rank=3534534;
      int highestScore=457567;
      int password=5656;


      public String getUserID() {
            return userID;
      }

      public void setUserID(String userID) {
            this.userID = userID;
      }

      public int getRank() {
            return rank;
      }

      public void setRank(int rank) {
            this.rank = rank;
      }

      public int getHighestScore() {
            return highestScore;
      }

      public void setHighestScore(int highestScore) {
            this.highestScore = highestScore;
      }

      public int getPassword() {
            return password;
      }

      public void setPassword(int password) {
            this.password = password;
      }

      
      
      GameUser(){
    	  System.out.println("constructor content..!");
      }
      
      
}
