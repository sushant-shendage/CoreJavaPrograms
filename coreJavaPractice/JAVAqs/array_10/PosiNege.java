import java.util.Arrays;

public class PosiNege {
  public static void main(String[] args) {
    int[] a = {-9,-8,1,2,3,4,-5,-6,-7,-8,6,6};
    int count = 0;

    System.out.println("Arrays : " + Arrays.toString(a));
    System.out.println("Arrays length : " + a.length);
    for (int i = 0, j = a.length - 1; i < a.length / 2;) {

      // i+ j-
      if (a[i] > 0 && a[j] < 0) {
        a[i] = a[i] + a[j];
        a[j] = a[i] - a[j];
        a[i] = a[i] - a[j];
        i++;
        j--;
        count++;
        System.out.println("(+,-)Arrays " + count + " : " + Arrays.toString(a));
      }
      // i- j-
      else if (a[i] < 0 && a[j] < 0) {

        i++;
        count++;
        System.out.println("(-,-)Arrays " + count + " : " + Arrays.toString(a));
      }
      // i+ j+
      else if (a[i] > 0 && a[j] > 0) {
        j--;
        count++;
        System.out.println("(+,+)Arrays " + count + " : " + Arrays.toString(a));
      }
      // -i j+
      else {
        i++;
        j--;
        System.out.println("(-,+)Arrays " + count + " : " + Arrays.toString(a));
        count++;
      }

    }
    System.out.println("M_Arrays : " + Arrays.toString(a));

    System.out.println("pgm exicuted..!");
  }

}
