
 
public class SingleTonClass {

    static SingleTonClass singleObj;

    private SingleTonClass() {
    }

    public static SingleTonClass SingleTonClassObj() {
        if (singleObj == null) {
            singleObj= new SingleTonClass();
        }
        return singleObj;
    }
}

