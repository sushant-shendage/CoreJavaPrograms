
public class Driver1 {
    public static void main(String[] args) {

        // way 2
        Employee1Imp1 i1 = () -> {
            return new Employee1();
        };
        i1.m1();

        // way3
        Employee1Imp1 i2 = Employee1::new;
        Employee1 i3 = i2.m1();

    }
}

class Employee1 {

    Employee1() {
        System.out.println("i am employee..!");
    }
}

@FunctionalInterface
interface Employee1Imp1 {
    Employee1 m1();
}

class Test implements Employee1Imp1 {
    public Employee1 m1() {
        Employee1 e1 = new Employee1();
        return e1;
    }
}