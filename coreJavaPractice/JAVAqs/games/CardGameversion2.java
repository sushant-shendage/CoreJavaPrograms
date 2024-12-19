import java.util.Arrays;

public class CardGameversion2 {
    public static void main(String[] args) {

        gamePlay();

    }

    static void gamePlay() {

        int randomCard = 0;
        int cardSet[] = cardPack();
        System.out.println(Arrays.toString(cardSet));

        int player1Card[] = new int[0];
        int player2Card[] = new int[0];

        System.out.println("player 1 :: " + Arrays.toString(player1Card));
        System.out.println("player 2 :: " + Arrays.toString(player2Card));

        // distrubuting 6 card to each player...!
        for (int i = 1; i < 6; i++) {
            randomCard = generateRandomNum(cardSet.length-1);
            cardSet = removeCard(cardSet, randomCard);

            player1Card = addCard(player1Card, randomCard);
        }
        for (int i = 1; i < 6; i++) {
            randomCard = generateRandomNum(cardSet.length-1);
            cardSet = removeCard(cardSet, randomCard);

            player2Card = addCard(player2Card, randomCard);
        }

        System.out.println("cardSet :: " + Arrays.toString(cardSet));
        System.out.println("player 1  :: " + Arrays.toString(player1Card));
        System.out.println("player 2  :: " + Arrays.toString(player2Card));

        System.out.println("player 1's turn ::");

        int demoCards[] = { 1, 10, 2, 6, 9, 5 };
        sortCards(demoCards);

    }

    static int nextMultiple(int num, int multiple) {

        for (int i = num;; i++) {
            if (i % multiple == 0) {
                 
                return i;
            }
        }
    }

    static void sortCards(int arr[]) {
        int refArr[] = new int[6];
        Arrays.sort(arr);
        for (int i = 0; i < refArr.length; i++) {
             refArr[i]=nextMultiple(arr[i], 4);
        }

        System.out.println("ref arr ::"+Arrays.toString(refArr));
    }

    static int generateRandomNum(int limit) {
        return (int) (Math.random() * 100) % 52 + 1;
    }

    static int[] removeCard(int arr[], int num) {
        int modifiedArr[] = new int[arr.length - 1];

        for (int i = 0, j = 0; j < modifiedArr.length; i++, j++) {

            if (arr[i] == num) {
                j--;
                continue;
            }
            modifiedArr[j] = arr[i];
        }

        return modifiedArr;
    }

    static int[] addCard(int arr[], int num) {
        int modifiedArr[] = new int[arr.length + 1];

        if (modifiedArr.length == 1) {
            modifiedArr[modifiedArr.length - 1] = num;
            return modifiedArr;
        } else {

            for (int i = 0; i < modifiedArr.length - 1; i++) {
                modifiedArr[i] = arr[i];
            }
            modifiedArr[modifiedArr.length - 1] = num;
            return modifiedArr;
        }

    }

    static int[] cardPack() {
        int arr[] = new int[52];

        for (int i = 0; i < 52; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }
}
