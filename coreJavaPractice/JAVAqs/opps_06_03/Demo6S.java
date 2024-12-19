public class Demo6S extends Demo6F {
    String sName;

    Demo6S(){}

    Demo6S(String gFName,String fName,String sName){
        super(gFName,fName);
        this.sName=sName;
    }

    void sInfo(){
        fInfo();
        System.out.println("sName :"+this.sName);
        System.out.println("-----------------------");
    }
    
}
