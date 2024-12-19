public class Encaps2Driver {
    public static void main(String[] args) {
        Encaps2 ob1=new Encaps2("cse",8.7f);

        System.out.println("branch :"+ob1.getBranch());
        System.out.println("cgpa :"+ob1.getCgpa());

        ob1.setBranch("IT");
        ob1.setCgpa(9.5f);

        System.out.println("branch :"+ob1.getBranch());
        System.out.println("cgpa :"+ob1.getCgpa());
    }
    
}
