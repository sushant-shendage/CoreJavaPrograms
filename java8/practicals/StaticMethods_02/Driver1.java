// package javapgms.java8.practicals.StaticMethods_02;

public class Driver1 {
    public static void main(String[] args) {
        Car1 ob1 = new Car1();
        Bicycal ob2 = new Bicycal();

        ob1.fuel();
        ob2.fuel();

        Vehical.commonActivity();


    }
}

interface Vehical {
    void fuel();
    static void commonActivity() {
        start();
        run();
        stop();

    }

    static void start(){
        System.out.print("START ");
    }
    static void run(){
        System.out.print("RUN ");
    }
    static void stop(){
        System.out.print("STOP ");
    }
}

class Car1 implements Vehical {
    @Override
    public void fuel() {
        System.out.println("fuel consumption:disel/petrol");
    }
}

class Bicycal implements Vehical {
    @Override
    public void fuel() {
        System.out.println("fuel consumption: No fuel");
    }
}