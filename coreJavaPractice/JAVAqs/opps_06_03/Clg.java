public class Clg extends University {
    String cName;
    Clg()
    {

    }

    Clg(String cName,String uName)
    {
        super(uName);
        this.cName=cName;  
    }

    void CInfo()
    {
        UInfo();
        System.out.println("Clg Info");
        System.out.println("Name :"+this.cName);
        System.out.println("-------------------------");
    }
    
}