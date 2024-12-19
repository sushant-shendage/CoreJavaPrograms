// package javapgms.java8.practicals.StaticMethods_02;

public class Driver2 {
    public static void main(String[] args) {
        Mobiles.commonFeatures();
        new SmartPhones().advancedFeatures();
        new Tablets().advancedFeatures();
    }
}

interface Mobiles{
    void advancedFeatures();
    static void commonFeatures(){
        System.out.println("[cOMMON FEATURES ] :calling | SMS | FM");
    }
}

class SmartPhones implements Mobiles{
@Override
public void advancedFeatures() {
    System.out.println("[SMARTPHONES] : video call | play games |install and use apps | can run browser | camera");
}
}

class Tablets implements Mobiles{
    @Override
    public void advancedFeatures() {
    System.out.println("[TABLETS    ] :  can VIDEO  games | can code");
    }
    }