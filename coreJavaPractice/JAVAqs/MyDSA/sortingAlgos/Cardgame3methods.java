import java.util.Arrays;

public class Cardgame3methods {

    static int[] sixCardSet(int main[]) {
        int modifiedArr[] = new int[1], randomNumber;
        for (int i = 1; i <= 6; i++) {
            randomNumber = main[generaterandomNum(main.length)];
            main = remove(main, randomNumber);
            modifiedArr = add(modifiedArr, randomNumber);
        }
        modifiedArr = remove(modifiedArr, 0);
        Cardgame3.cardSet = main;

        return modifiedArr;
    }

    static void shuffle(int arr[]) {
        int index1, index2;
        for (int i = 0; i < arr.length; i++) {
            index1 = generaterandomNum(arr.length);
            index2 = generaterandomNum(arr.length);
            if (index1 == index2) {
                continue;
            }
            arr[index1] = arr[index1] + arr[index2];
            arr[index2] = arr[index1] - arr[index2];
            arr[index1] = arr[index1] - arr[index2];
        }
    }

    static int generaterandomNum(int num) {
        return (int) (Math.random() * 100) % num;
    }

    static int[] add(int arr[], int element) {
        int modifiedArr[] = new int[arr.length + 1];
        for (int i = 0; i < modifiedArr.length - 1; i++) {
            modifiedArr[i] = arr[i];
        }
        modifiedArr[modifiedArr.length - 1] = element;
        return modifiedArr;
    }

    static int[] remove(int arr[], int element) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                break;
            }
        }

        arr[i] = arr[i] + arr[arr.length - 1];
        arr[arr.length - 1] = arr[i] - arr[arr.length - 1];
        arr[i] = arr[i] - arr[arr.length - 1];

        int modifiedArr[] = new int[arr.length - 1];
        for (int j = 0; j < modifiedArr.length; j++) {
            modifiedArr[j] = arr[j];
        }
        return modifiedArr;
    }

    static int[] originalSet() {
        int originalSet[] = new int[52];
        for (int i = 0; i < 52; i++) {
            originalSet[i] = i + 1;
        }

        return originalSet;
    }
}
