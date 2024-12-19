public class Dept extends Clg{
    String dName;

    Dept()
    {

    }

    Dept(String uName,String cName,String dName)
    {
        super(uName,cName);

        this.dName=dName;
    }
    
   
    void DInfo()
    {
        CInfo();
        System.out.println("Dept Info");
        System.out.println("Name :"+this.dName);
        System.out.println("-------------------------");
    }

}
