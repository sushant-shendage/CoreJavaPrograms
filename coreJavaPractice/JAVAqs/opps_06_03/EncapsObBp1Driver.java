
public class EncapsObBp1Driver {
    public static void main(String[] args) {
        EncapsObBp1 ob1=new EncapsObBp1("name1",11);

        System.out.println("current name :"+ ob1.getName());
        System.out.println("current age  :"+ ob1.getAge());

        ob1.setName("name2");
        ob1.setAge(22);


        System.out.println("updated   name :"+ ob1.getName());
        System.out.println("updated    age :"+ ob1.getAge());
        

        ob1.setName("name3");
        ob1.setAge(33);


        System.out.println("updated   name :"+ ob1.getName());
        System.out.println("updated    age :"+ ob1.getAge());
        


       
    }
    
}
