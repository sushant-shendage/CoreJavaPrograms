public class Person2BlueprintDriver {
    public static void main(String[] args) {
        Person2Blueprint ob1=new Person2Blueprint("Ajay");
        
        System.out.println("NAME : "+ob1.getName());

        ob1.setName("vijay");

        System.out.println("NAME : "+ob1.getName());
    }
    
}
