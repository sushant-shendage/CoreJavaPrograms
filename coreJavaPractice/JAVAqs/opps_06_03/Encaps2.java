public class Encaps2 {

    String branch;
    float cgpa;

    Encaps2() {

    }

    Encaps2(String branch, float cgpa) {
        this.branch = branch ;
        this.cgpa   = cgpa   ;
    }

    public Encaps2(int i, int j) {
        //TODO Auto-generated constructor stub
    }

    void setBranch(String branch)
    {
        this.branch=branch;
    }
    void setCgpa(float cgpa)
    {
        this.cgpa=cgpa;
    }

      String getBranch() {
        return branch;
    }
     float getCgpa() {
        return cgpa;
    }

    public char[] getA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getA'");
    }

    public void setA(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setA'");
    }

}
