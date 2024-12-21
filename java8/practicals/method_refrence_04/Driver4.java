public class Driver4{
    public static void main(String[] args) {

	  
    User u1=Driver4::welcomemsg;
    u1.sendAlertMsg();

	}
    static void  welcomemsg(){
        System.out.println(" Thank you for choosing Axis Bank..!..!");
        System.out.println(" You will welcome kit soon..!");
    }
}   

@FunctionalInterface
interface User{
    void sendAlertMsg();
}