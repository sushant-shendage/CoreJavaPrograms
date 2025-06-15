public class DriverConstrctorOverloading {
   public static void main(String[] args) {
     Parent1 ob1=new Parent1();
    Parent1 ob2=new Parent1(33);
   }

}
class Parent1{
    Parent1(){
        System.out.println("no argument of constructor of parent1");
    }
     Parent1(int i){
        System.out.println("single integer argument constructor of parent1");
    }
}