public class PersonDriver {
    public static void main(String[] args) {
        PersonBP ob1=new PersonBP("Ajay",5000);
         System.out.printf("name :%s salary: %d",ob1.getName(),ob1.getSalary());
         ob1.setName("vijay");
         ob1.setSalary(7000);
         System.out.printf("name :%s salary: %d",ob1.getName(),ob1.getSalary());
         

    }
    
}
