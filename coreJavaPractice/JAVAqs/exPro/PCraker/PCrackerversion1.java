// package exPro.PCraker;

public class PCrackerversion1 {
    public static void main(String[] args) {
        char charInPass='Z';
        char passwordCraked=' ';

        int key=charInPass+0;

        for (int i = 0;;i++) {
            if (i==key) {
                System.out.println("given cahrecter is "+(char)(key));
                break;
            }
        }
    }
}
