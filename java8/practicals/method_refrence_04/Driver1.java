public class Driver1{
    public static void main(String[] args) {

	 Services s1=()->System.out.println("welcome");
    s1.greetingService();
    Services s2=Driver1::greetings;
    s2.greetingService();

	}
    static void  greetings(){
        System.out.println("welcome using static method refrence..!");
    }
}   
interface Services{
    void greetingService();
}