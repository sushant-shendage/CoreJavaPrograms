public class Encaps1Driver {
    public static void main(String[] args) {
        Encaps1 ob1 = new Encaps1(1, 2, 3, 4);

        ob1.getAll();

        ob1.setB(22);
        ob1.setD(44);

        ob1.getAll();

    }
}
