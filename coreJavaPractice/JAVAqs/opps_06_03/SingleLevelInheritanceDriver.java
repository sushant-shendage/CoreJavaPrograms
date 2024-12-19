public class SingleLevelInheritanceDriver {
    public static void main(String[] args) {
        SingleInheritanceParent ob1=new SingleInheritanceParent();
        SingleInheritanceChild ob2=new SingleInheritanceChild();

        //ob1.parentMethod();
       // ob1.childMethod();//CTE

       ob2.parentMethod();
       ob2.childMethod();
    }
    
}
