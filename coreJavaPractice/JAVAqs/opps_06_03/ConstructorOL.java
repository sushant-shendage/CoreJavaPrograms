public class ConstructorOL {

    String cAtt1;
    String cAtt2;
    String cAtt3;
    String oAtt1;
    String oAtt2;
    String commAtt="common-attribute-value";
    ConstructorOL(){
        System.out.println("this is message from no-argument  constructor");
       
    }

    ConstructorOL(String cAtt1,String cAtt2,String cAtt3){
        System.out.println("user filled compulosory attributes only");
        this.cAtt1=cAtt1;
        this.cAtt2=cAtt2;
        this.cAtt3=cAtt3;
       
    }

    ConstructorOL(String oAtt1,String oAtt2){
        System.out.println("user filled optional attributes only");
        this.oAtt1=oAtt1;
        this.oAtt2=oAtt2;
       
    }

    void displayAllAtt()
    {
System.out.println(" C-att1 : "+cAtt1);
System.out.println(" C-att2 : "+cAtt2);
System.out.println(" C-att3 : "+cAtt3);
System.out.println(" O-att4 : "+oAtt1);
System.out.println(" O-att5 : "+oAtt2);
System.out.println(" common : "+commAtt);
 
    }

  {
    System.out.println("non-static initilizer block 1");
  }
  {
    System.out.println("non-static initilizer block 2");
  }
    
}
