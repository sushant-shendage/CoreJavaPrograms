public class University {
    String uName;
    University()
    {

    }

    University(String uName)
    {
        this.uName=uName;  
    }

    void UInfo()
    {
        System.out.println("Univercity Info");
        System.out.println("Name :"+this.uName);
        System.out.println("-------------------------");
    }
    
}
