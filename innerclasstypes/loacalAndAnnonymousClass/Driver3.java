public class Driver3 {
    public static void main(String[] args) {
new Design1().staticmethod();
    }
}

class Design1 {
      void staticmethod() {
          class Display {
            void m1() {
                System.out.println("this is local inner class method instruction..!");
            }  
        }
       new Display().m1();

    }
}