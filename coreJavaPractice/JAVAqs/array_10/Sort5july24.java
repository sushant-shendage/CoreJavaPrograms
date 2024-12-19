public class Sort5july24 {
    public static void main(String[] args) {
        int[] a = { 4,3,2,1};
        // a = arrSortD(a);
        // Prob1Approch2.printArr(a);
        a = arrSortA(a);
        //Prob1Approch2.printArr(a);
    }

    public static int[] arrSortA(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];

                    Prob1Approch2.printArr(a);

                }
                //System.out.println("---------------");
            }
        }
        return a;
    }

    public static int[] arrSortD(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];

                    //Prob1Approch2.printArr(a);

                }
                //System.out.println("---------------");
            }
        }
        return a;
    }

}
