/**
 * SingletonClassDriver demonstrates the Singleton Design Pattern.
 * The Singleton pattern ensures that only one instance of a class is created.
 */
public class SingletonClassDriver {
    public static void main(String[] args) {
        // Calling createSingletonClassInstance() multiple times
        // It should return the same instance every time
        System.out.println(SingletonClass.createSingletonClassInstance());
        System.out.println(SingletonClass.createSingletonClassInstance());
        System.out.println(SingletonClass.createSingletonClassInstance());
        System.out.println(SingletonClass.createSingletonClassInstance());
    }
}

/**
 * SingletonClass ensures that only one object is created throughout the application.
 * It follows the Lazy Initialization technique.
 */
class SingletonClass {
    
    // Private constructor to prevent instantiation from outside
    private SingletonClass() {
    }
    
    // Static reference to hold the single instance of the class
    private static SingletonClass singletonClassObj;
    
    /**
     * This method provides a global access point to the Singleton instance.
     * It ensures only one instance is created and returns the same instance on multiple calls.
     * 
     * @return SingletonClass - the single instance of this class
     */
    public static SingletonClass createSingletonClassInstance() {
        // Lazy initialization - the instance is created only when needed
        if (singletonClassObj == null) {
            singletonClassObj = new SingletonClass();
        }
        return singletonClassObj; // Return the same instance
    }
}
