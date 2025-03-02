// package javapgms.DesignPatterens.factorymethod;

/**
 * FactoryMethodDriver class demonstrates the Factory Method Design Pattern.
 * It creates device objects using the DeviceFactory class and invokes their methods.
 */
public class FactoryMethodDriver {
    public static void main(String[] args) {
        // Creating a device of type "drone"
        Device d1 = DeviceFactory.createDevice("drone");
        d1.deviceName(); // Calling deviceName method

        // Creating a device of type "sniper"
        Device d2 = DeviceFactory.createDevice("sniper");
        d2.deviceName(); // Calling deviceName method
    }
}

/**
 * Device interface represents a functional interface with a single method.
 * This method will be implemented using lambda expressions in the factory.
 */
@FunctionalInterface
interface Device {
    /**
     * Displays the name of the device.
     */
    void deviceName();
}

/**
 * DeviceFactory class provides a factory method to create different types of devices.
 * It follows the Factory Method Design Pattern by encapsulating object creation logic.
 */
class DeviceFactory {

    /**
     * Factory method that creates and returns a Device object based on the given device name.
     * Uses lambda expressions to provide implementation for the deviceName method.
     * 
     * @param deviceName The name of the device to be created.
     * @return A Device instance based on the provided name or null if not recognized.
     */
    public static Device createDevice(String deviceName) {
        if (deviceName.equals("drone"))
            return () -> System.out.println("DeviceName: drone");
        else if (deviceName.equals("sniper"))
            return () -> System.out.println("DeviceName: sniper");
        return null; // Returns null if the input deviceName does not match known devices
    }
}
