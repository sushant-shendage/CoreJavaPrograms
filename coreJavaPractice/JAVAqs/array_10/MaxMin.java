public class MaxMin {
    public static void main(String[] args) {

        int[] a = { 1, 1, 2, 3, 3, 4,4, 5 };

        // arrMaxEle(a);
        // arrMinEle(a);
        // arrSecondMaxEle(a);
        // arrSecondMinEle(a);
        // arrThirdMaxEle(a);
         arrFourthMaxEle(a);
        arrFifthMaxEle(a);

    }

    public static void arrMaxEle(int[] arr) {
        int max = -2147483648;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MAXIMUM : " + max);

    }

    public static void arrSecondMaxEle(int[] arr) {
        int max = -2147483648;
        int smax = -2147483648;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }

        }
        System.out.println("SECOND MAXIMUM : " + smax);

    }

    public static void arrThirdMaxEle(int[] arr) {
        int max = -2147483648;
        int smax = -2147483648;
        int tmax = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                tmax = smax;
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                tmax = smax;
                smax = arr[i];
            } else if (arr[i] > tmax && arr[i] != smax) {
                tmax = arr[i];

            }

        }
        System.out.println("Third MAXIMUM : " + tmax);

    }

    public static void arrFourthMaxEle(int[] arr) {
        int max = -2147483648;
        int smax = -2147483648;
        int tmax = -2147483648;
        int f4max = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                f4max = tmax;
                tmax = smax;
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                f4max = tmax;
                tmax = smax;
                smax = arr[i];
            } else if (arr[i] > tmax && arr[i] != smax) {
                tmax = f4max;
                tmax = arr[i];

            } else if (arr[i] > f4max && arr[i] != tmax) {
                f4max = arr[i];
            }

        }
        System.out.println("FOURTH MAXIMUM : " + f4max);

    }


    public static void arrFifthMaxEle(int[] arr) {
        int max = -2147483648;
        int smax = -2147483648;
        int tmax = -2147483648;
        int f4max = -2147483648;
        int f5max = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                f5max=f4max;
                f4max = tmax;
                tmax = smax;
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                
                tmax = smax;
                smax = arr[i];
            } else if (arr[i] > tmax && arr[i] != smax) {
                f4max = tmax;
                tmax = arr[i];

            } else if (arr[i] > f4max && arr[i] != tmax) {
                f5max=f4max;
                f4max = arr[i];
            }
            else if (arr[i] > f5max && arr[i] != f4max) {
                 
                f5max = arr[i];
            }

        }
        System.out.println("FIFTH MAXIMUM : " + f5max);

    }
    public static void arrMinEle(int[] arr) {
        int min = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MINIMUM : " + min);

    }

    public static void arrSecondMinEle(int[] arr) {
        int min = 2147483647;
        int smin = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin && arr[i] != min) {
                smin = arr[i];
            }

        }
        System.out.println("SECOND MINIMUM : " + smin);

    }

}
