public class Demo6F extends Demo6Gf {
    String fName;

    Demo6F(){}

    Demo6F(String gFName,String fName){
        super(gFName);
        this.fName=fName;
    }

    void fInfo(){
        gFInfo();
        System.out.println("fName :"+this.fName);
        System.out.println("-----------------------");
    }
    
}
