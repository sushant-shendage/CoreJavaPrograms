public class Driver3{
    public static void main(String[] args) {

	  
    User u1=Driver3::alertmsg;
    u1.getClass();

	}
    static void  alertmsg(){
        System.out.println(" Your account is hacked..!");
    }
}   

@FunctionalInterface
interface User{
    void sendAlertMsg();
}