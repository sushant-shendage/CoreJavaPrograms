public class DriverMethodOverriding {
    public static void main(String[] args) {
        Parent1 ob= new Child1();

        ob.parent1Method1();
    }
}

class Parent1{
    void parent1Method1(){
        System.out.println("parent1Method 1");
    }
}

class Child1 extends Parent1{
    public void parent1Method1(){
          System.out.println("parent1Method 1 overrided in child class..!");
    }
}