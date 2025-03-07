public class Driver6 {
    public static void main(String[] args) {
        new Dept();
    }

}

class University {
    
    String universityName = "XYZ university";
     
      University(int i){
        System.out.println("University Name :: "+this.universityName);
        System.out.println("--------------------");
    }
     
}

class College extends University{
    String collegeName = "PQR college";



      College(String s) {
         super(8);
        System.out.println("CollegeName:: " + this.collegeName);
        System.out.println("--------------------");
    }
}

class Dept extends College{
    String collegeName = "PQR college";



    Dept() {
         super("");
        System.out.println("DeptName:: CSE" );
        System.out.println("--------------------");
    }
}