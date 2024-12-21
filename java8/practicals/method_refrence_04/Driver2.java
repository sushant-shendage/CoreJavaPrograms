public class Driver2{
    public static void main(String[] args) {

	  
    User u1=Driver2::notification;
    u1.placedOrderNotification();

	}
    static void  notification(){
        System.out.println(" Your order placed successfully..!");
    }
}   
interface User{
    void placedOrderNotification();
}