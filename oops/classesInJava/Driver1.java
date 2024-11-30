class Driver1{
    public static void main(String[] args) {
        GameUser user=new GameUser();
        user.displayInfo();

    }

}

class GameUser{
    private int accountId;
    private String userName="Yz1";
    private String userPassword;
    private int score=13123;
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void displayInfo(){
        System.out.println("user Name :"+this.userName);
        System.out.println("score     :"+this.score);

    }



}