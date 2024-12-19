public class ConstructorOlDriver {
    public static void main(String[] args) {

        ConstructorOL ob1=new ConstructorOL("one","two","three");

        ob1.displayAllAtt();


        ConstructorOL ob2=new ConstructorOL("four","five");

        ob2.displayAllAtt();


        ConstructorOL ob3=new ConstructorOL();

        ob3.displayAllAtt();
    }
    
}
