
public class EncapsObBp1 {

    private String name;
    private int age;

    EncapsObBp1(){}

    EncapsObBp1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    
}
