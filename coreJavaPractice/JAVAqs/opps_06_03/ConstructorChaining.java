public class ConstructorChaining {

    String cAtt1;
    String cAtt2;
    String cAtt3;
    String oAtt1;
    String oAtt2;

    ConstructorChaining() {
    }

    ConstructorChaining(String cAtt1, String cAtt2, String cAtt3) {
     this.cAtt1=cAtt1;
     this.cAtt2=cAtt2;
     this.cAtt3=cAtt3;

     System.out.println("constructor with compulsory attributes");

    }

    ConstructorChaining(String cAtt1, String cAtt2, String cAtt3,String oAtt1, String oAtt2) {
        this( cAtt1,cAtt2, cAtt3);
        this.oAtt1=oAtt1;
        this.oAtt2=oAtt2;
        
        System.out.println("constructor with optional attributes");
   
       }

}
