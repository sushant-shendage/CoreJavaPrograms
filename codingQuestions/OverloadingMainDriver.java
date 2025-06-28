// package codingQuestions;

public class OverloadingMainDriver {
    public static void main(String[] args) {
        main();
        main(1);
    }

    public static void main(String args) {
        {
            System.out.println("called main method with sigle string-argument");
        }
    }

    public static void main(int args) {
        {
            System.out.println("called main method with sigle int-argument");
        }
    }

    public static void main() {
        {
            System.out.println("called no-argument main method ");
        }
    }
}
