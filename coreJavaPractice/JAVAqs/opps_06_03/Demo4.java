public class Demo4 {
    //consructor chaining
    String cAtt1;
    String cAtt2;
    String cAtt3;
    String oAtt1;
    String oAtt2;

    Demo4(){}

    Demo4(String cAtt1,String cAtt2,String cAtt3){
        System.out.println("3 compulsory attributes");
        this.cAtt1=cAtt1;
        this.cAtt2=cAtt2;
        this.cAtt3=cAtt3;
    }

    Demo4(String cAtt1,String cAtt2,String cAtt3, String oAtt1,String oAtt2){
        this( cAtt1, cAtt2, cAtt3);
        System.out.println(" compulsory and optional attributes attributes");
         this.oAtt1=oAtt1;
         this.oAtt2=oAtt2;
    }

    void demo3Details()
    {
        System.out.println("cAtt1 :"+cAtt1);
        System.out.println("cAtt2 :"+cAtt2);
        System.out.println("cAtt3 :"+cAtt3);
        System.out.println("oAtt1 :"+oAtt1);
        System.out.println("oAtt2 :"+oAtt2);
        System.out.println("--------------------------------");

    }
    
}
