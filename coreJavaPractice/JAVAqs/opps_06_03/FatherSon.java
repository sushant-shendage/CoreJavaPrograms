public class FatherSon {
   public static void main(String[] args) {
 
Father f1=new Son();//upcasting
f1.sonMethod();
f1.fatherMethod();

Son s1=(Son) f1;//downcasting
s1.sonMethod();
s1.fatherMethod();




   }
}
