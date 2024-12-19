public class Demo3 {
    //constructor overloading

    String cAtt1;
    String cAtt2;
    String cAtt3;
    String oAtt1;
    String oAtt2;

    Demo3(){
        System.out.println("three compulsory attributes-msg from no argument constructor");
    }

    Demo3(String cAtt1,String cAtt2,String cAtt3){
        //instructions to load attributes
        this.cAtt1=cAtt1;
        this.cAtt2=cAtt2;
        this.cAtt3=cAtt3;
//user defined instructions
        System.out.println("three compulsory attributes-msg from constructor containing 3 argument");
    }
    
    Demo3( String oAtt1,String oAtt2){
         //instructions to load attributes
         this.oAtt1=oAtt1;
         this.oAtt2=oAtt2;
 //user defined instructions
         System.out.println("two optional attributes-msg from constructor containing 2 argument");

    }
    Demo3(String cAtt1,String cAtt2,String cAtt3,String oAtt1,String oAtt2)
    {
        this.cAtt1=cAtt1;
        this.cAtt2=cAtt2;
        this.cAtt3=cAtt3;
        this.oAtt1=oAtt1;
        this.oAtt2=oAtt2;
        System.out.println("5 optional&compulsory  attributes-msg from constructor containing 5 argument");

    }
    
    void allDetails()
    {
        System.out.println("cAtt1 :"+cAtt1);
        System.out.println("cAtt2 :"+cAtt2);
        System.out.println("cAtt3 :"+cAtt3);
        System.out.println("oAtt1 :"+oAtt1);
        System.out.println("oAtt2 :"+oAtt2);
        System.out.println("--------------------------------");

    }
    
}
