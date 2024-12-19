public class ConstructorChainingBP {
     int a1;
     int a2;

     ConstructorChainingBP()
     {

     }
     ConstructorChainingBP(int a1)
     {
         this.a1=a1;
     }

     ConstructorChainingBP(int a1,int a2)
     {
        this(a1);
         this.a2=a2;
     }

     void display()
     {
        System.out.printf("a1: %d  a2: %d",this.a1,this.a2);
     }
}
