public class DriverMethodOverloading {
    public static void main(String[] args) {
        printMessage();
        printMessage(0);
        printMessage(0, 0);
    }
static void printMessage(){
    System.out.println("method with no arguments..!");
}

static void printMessage(int i){
    System.out.println("method with single integer argument ..!");
}

static void printMessage(int i,float j){
    System.out.println("method with single integer and float argument ..!");
}


}
