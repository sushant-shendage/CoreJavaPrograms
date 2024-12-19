public class Account {
    String first_name;
    String last_name;
    double balance;
    
    
     Account(String first_name,String last_name,double balance)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.balance=balance;
        
    }
   
   void displayAccount()
    {
        System.out.println("first_name:"+(this.first_name));
        System.out.println("last_name:"+(this.last_name));
        System.out.println("Balance:"+(this.balance));
    }

    
    
}
