import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShuffelElements {
    public static void main(String[] args) {
        {
            // SHUFFLING ELEMENTS IN AN ARRAY
            // int a[] = {
            // 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
            // System.out.println(Arrays.toString(a));
            // shuffle(a);
            // System.out.println(Arrays.toString(a));

            // ADD ELEMENT TO ARRAY
            // int a[]={1,22,333};
            // System.out.println(Arrays.toString(a));
            // a=addAEleToArr(a,4444);
            // System.out.println(Arrays.toString(a));

            // REMOVE ELEMEMNT IN ARRAY
            // int a[]={1,2,3,4};
            // System.out.println(Arrays.toString(a));
            // a=removeAEleFromArr(a,2);

            // System.out.println(Arrays.toString(a));
        
        // System.out.println("[Ace] [2 ] [3 ] [4 ] [5 ] [6 ] [7 ] [8 ] [9 ] [10 ] [J ]
        // [K ] [Q ]");
        // System.out.println("[1-4] [5-8] [9-12] [13-16] [17-20] [21-24] [25-28]
        // [29-32] [33-36] [37-40] [41-44] [45-48] [49-52]");
        }
        int a8[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52 };
        // shuffle(a8);
        int a9[] = new int[1];
        int a10[] = new int[1];

        int randomIndexa9 = 0, randomNumbera9 = 0, randomIndexa10 = 0, randomNumbera10 = 0;

        // while (a9.length < 6) {
        //     randomIndexa9 = generateRandom(a8.length);
        //     randomNumbera9 = a8[randomIndexa9];
        //     a9=addAEleToArr(a9, randomNumbera9);
        //     a8=removeAEleFromArr(a8, randomNumbera9);
        //     randomIndexa10 = generateRandom(a8.length);
        //     randomNumbera10 = a8[randomIndexa10];
        //     a10=addAEleToArr(a10, randomNumbera10);
        //     a8=removeAEleFromArr(a8, randomNumbera10);

        // }
        // System.out.println("a8.length::"+a8.length);
        // System.out.println("a9.length::"+a9.length);
        // System.out.println("a10.length::"+a10.length);

        // System.out.println("array before sorting");
        System.out.println(Arrays.toString(a8));
        System.out.println(Arrays.toString(a9));
        System.out.println(Arrays.toString(a10));

        Arrays.sort(a9);
        Arrays.sort(a10);

        System.out.println("array after sorting");
        System.out.println("pack of cards :: " + Arrays.toString(a8));
        System.out.println("cards of computer :: " + Arrays.toString(a9));
        System.out.println("cards of player   :: " + Arrays.toString(a10));

        System.out.print("computer ::\n");
        pairsIncardSet2(a9);
        // System.out.print("player ::");
        // pairsIncardSet(a10);
        // for (;;) {
            // System.out.println("[Ace] [2 ] [3 ] [4 ] [5 ] [6 ] [7 ] [8 ] [9 ] [10 ] [J ]
            // [K ] [Q ]");
            // System.out.println("[1-4] [5-8] [9-12] [13-16] [17-20] [21-24] [25-28]
            // [29-32] [33-36] [37-40] [41-44] [45-48] [49-52]");

            // int selectedRandomCardIndexa9 = generateRandom(a8.length),
            //         selectedRandomCarda9 = a8[selectedRandomCardIndexa9];
            // removeAEleFromArr(a8, selectedRandomCarda9);
            // System.out.println("a8length" + a8.length);

            // System.out.println("selectRandomCardIndex ::"+selectedRandomCardIndexa9+"
            // selectedRandomCard :: "+selectedRandomCarda9);
            // System.out.println(Arrays.toString(a8));
            // System.out.println("computer's turn");
            // player1Reaction(a8, a9, selectedRandomCardIndexa9);

            // Arrays.sort(a9);
            // System.out.println(Arrays.toString(a9));
            // //System.out.println(Arrays.toString(a10));
            // pairsIncardSet(a9);
            // pairsIncardSet(a10);

            // System.out.println("player's turn");
            // int selectedRandomCardIndexa10 = generateRandom(a8.length),
            // selectedRandomCarda10 = a8[selectedRandomCardIndexa10];
            // removeAEleFromArr(a8, selectedRandomCarda10);
            // System.out.println(Arrays.toString(a8));
            // player1Reaction(a8, a10, selectedRandomCardIndexa10);

            // Arrays.sort(a10);
            // System.out.println(Arrays.toString(a9));
            // System.out.println(Arrays.toString(a10));
            // pairsIncardSet(a9);
            // pairsIncardSet(a10);

        // }
int testArr[]=new int[1];
addAEleToArr(testArr,33);

System.out.println(Arrays.toString(testArr));
//GAME FAILED

        
    }

    private static void player1Reaction(int[] arrMain, int subArr[], int selectedRandomCardIndex) {
        System.out.println("selectRandomCardIndex ::" + selectedRandomCardIndex + "  selectedRandomCard ::"
                + arrMain[selectedRandomCardIndex]);
        int cardInConsideration = arrMain[selectedRandomCardIndex];
        Scanner sc = new Scanner(System.in);

        int accept;
        for (;;) {
            System.out.println("enter 1 or 0 to accept or reject card respectively ::");
            accept = sc.nextInt();
            if (accept == 0) {
                System.out.println("card rejected");
                break;
            } else if (accept == 1) {
                System.out.println("card accepted");
                // after accepting card procedure
                int replaceCard;
                System.out.println("Enter the card you want to replace");
                replaceCard = sc.nextInt();

                if (accept == 1) {
                    for (int i = 0; i < subArr.length; i++) {
                        if (subArr[i] == replaceCard) {
                            subArr[i] = cardInConsideration;
                            break;
                        }
                    }
                }
                break;
            } else {
                System.out.println("please enter i/p as per instruction ...!");
            }

        }

        // sfter rejecting card procedure
        System.out.println("fuction exicution completed..!");

    }

    static void pairsIncardSet(int arr[]) {
        int pairCount = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i]>=41 && arr[i]<=44) {
        // System.out.println("41-44");
        // pairCount++;
        // }
        // }
        for (int i = 0; i < arr.length - 1; i += 2) {
            if ((arr[i] >= 1 && arr[i] <= 4) && (arr[i + 1] >= 1 && arr[i + 1] <= 4) ||
                    (arr[i] >= 5 && arr[i] <= 8) && (arr[i + 1] >= 5 && arr[i + 1] <= 8) ||
                    (arr[i] >= 9 && arr[i] <= 12) && (arr[i + 1] >= 9 && arr[i + 1] <= 12) ||
                    (arr[i] >= 13 && arr[i] <= 16) && (arr[i + 1] >= 13 && arr[i + 1] <= 16) ||
                    (arr[i] >= 17 && arr[i] <= 20) && (arr[i + 1] >= 17 && arr[i + 1] <= 20) ||
                    (arr[i] >= 21 && arr[i] <= 24) && (arr[i + 1] >= 21 && arr[i + 1] <= 24) ||
                    (arr[i] >= 25 && arr[i] <= 28) && (arr[i + 1] >= 25 && arr[i + 1] <= 28) ||
                    (arr[i] >= 29 && arr[i] <= 32) && (arr[i + 1] >= 29 && arr[i + 1] <= 32) ||
                    (arr[i] >= 33 && arr[i] <= 36) && (arr[i + 1] >= 33 && arr[i + 1] <= 36) ||
                    (arr[i] >= 37 && arr[i] <= 40) && (arr[i + 1] >= 37 && arr[i + 1] <= 40) ||
                    (arr[i] >= 45 && arr[i] <= 48) && (arr[i + 1] >= 45 && arr[i + 1] <= 48) ||
                    (arr[i] >= 49 && arr[i] <= 52) && (arr[i + 1] >= 49 && arr[i + 1] <= 52)

            ) {
                System.out.println("0in set");
                pairCount++;
            }
            // else if ((arr[i] >= 41 && arr[i] <= 44) || (arr[i + 1] >= 41 && arr[i + 1] <=
            // 44)) {
            // System.out.println("in 41-44");
            // pairCount++;
            // }
        }
        for (int i = 1; i < arr.length -1; i += 2) {
            if ((arr[i] >= 1 && arr[i] <= 4) && (arr[i + 1] >= 1 && arr[i + 1] <= 4) ||
                    (arr[i] >= 5 && arr[i] <= 8) && (arr[i + 1] >= 5 && arr[i + 1] <= 8) ||
                    (arr[i] >= 9 && arr[i] <= 12) && (arr[i + 1] >= 9 && arr[i + 1] <= 12) ||
                    (arr[i] >= 13 && arr[i] <= 16) && (arr[i + 1] >= 13 && arr[i + 1] <= 16) ||
                    (arr[i] >= 17 && arr[i] <= 20) && (arr[i + 1] >= 17 && arr[i + 1] <= 20) ||
                    (arr[i] >= 21 && arr[i] <= 24) && (arr[i + 1] >= 21 && arr[i + 1] <= 24) ||
                    (arr[i] >= 25 && arr[i] <= 28) && (arr[i + 1] >= 25 && arr[i + 1] <= 28) ||
                    (arr[i] >= 29 && arr[i] <= 32) && (arr[i + 1] >= 29 && arr[i + 1] <= 32) ||
                    (arr[i] >= 33 && arr[i] <= 36) && (arr[i + 1] >= 33 && arr[i + 1] <= 36) ||
                    (arr[i] >= 37 && arr[i] <= 40) && (arr[i + 1] >= 37 && arr[i + 1] <= 40) ||
                    (arr[i] >= 45 && arr[i] <= 48) && (arr[i + 1] >= 45 && arr[i + 1] <= 48) ||
                    (arr[i] >= 49 && arr[i] <= 52) && (arr[i + 1] >= 49 && arr[i + 1] <= 52)

            ) {
                System.out.println("1in set");
                pairCount++;
            }
             if ((arr[i] >= 41 && arr[i] <= 44) || (arr[i + 1] >= 41 && arr[i + 1] <=
            44)) {
            System.out.println("in 41-44");
            pairCount++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 41 && arr[i] <= 44) {
                pairCount++;
            }
        }

        System.out.println("paired card number " + pairCount + " /3");
    }
   static void  pairsIncardSet2(int arr[])
   {
    int _1i4=0,_5i8=0,_9i12=0,_13i16=0,_17i20=0,_21i24=0,_25i28=0,_29i32=0,_33i36=0,_37i40=0,_41i44=0,_45i48=0,_49i52=0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>=1 && arr[i]<=4) {
            _1i4++;
        }
        else if (arr[i]>=5 && arr[i]<=8) {
            _5i8++;
        }
        else if (arr[i]>=9 && arr[i]<=12) {
            _9i12++;
        }
        else if (arr[i]>=13 && arr[i]<=16) {
            _13i16++;
        }
        else if (arr[i]>=17 && arr[i]<=20) {
            _17i20++;
        }
        else if (arr[i]>=5 && arr[i]<=24) {
            _21i24++;
        }
        else if (arr[i]>=25 && arr[i]<=28) {
            _25i28++;
        }

        else if (arr[i]>=29 && arr[i]<=32) {
            _29i32++;
        } else if (arr[i]>=33 && arr[i]<=36) {
            _33i36++;
        }
        else if (arr[i]>=37 && arr[i]<=40) {
            _37i40++;
        }
        else if (arr[i]>=41 && arr[i]<=44) {
            _41i44++;
        }
        else if (arr[i]>=45 && arr[i]<=48) {
            _45i48++;
        }
        else if (arr[i]>=49 && arr[i]<=52) {
            _49i52++;
        }

    }
    //=0,=0,=0,=0,=0,=0,=0,=0,=0,=0,=0,=0,=0
    int groupCardCount[]= {0};
    System.out.println("_1i4 : "+_1i4);
    addAEleToArr(groupCardCount,_1i4);

    System.out.println("_5i8 : "+_5i8);
    addAEleToArr(groupCardCount,_5i8);

    System.out.println("_9i12 : "+_9i12);
    addAEleToArr(groupCardCount,_9i12);
  
    System.out.println("_13i16 : "+_13i16);
    addAEleToArr(groupCardCount,_13i16);
  
    System.out.println("_17i20 : "+_17i20);
    addAEleToArr(groupCardCount,_17i20);
  
    System.out.println("_21i24 : "+_21i24);
    addAEleToArr(groupCardCount,_21i24);
  
    System.out.println("_25i28 : "+_25i28);
    addAEleToArr(groupCardCount,_25i28);
  
    System.out.println("_29i32 : "+_29i32);
    addAEleToArr(groupCardCount,_29i32);
  
    System.out.println("_33i36 : "+_33i36);
    addAEleToArr(groupCardCount,_33i36);
  
    System.out.println("_37i40 : "+_37i40);
    addAEleToArr(groupCardCount,_37i40);
  
    // System.out.println("_41i44 : "+_41i44);
    // addAEleToArr(groupCardCount,_41i44);
  
    System.out.println("_45i48 : "+_45i48);
    addAEleToArr(groupCardCount,_45i48);
  
    System.out.println("_49i52 : "+_49i52);
    addAEleToArr(groupCardCount,_49i52);

System.out.println(Arrays.toString(groupCardCount));


int pairCount=0;
 for (int j = 0; j < arr.length; j++) {
    
 }
   }
    static int[] removeAEleFromArr(int arr[], int element) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }

        arr[index] = arr[index] + arr[arr.length - 1];
        arr[arr.length - 1] = arr[index] - arr[arr.length - 1];
        arr[index] = arr[index] - arr[arr.length - 1];

        int modifiedArr[] = new int[arr.length - 1];
        for (int i = 0; i < modifiedArr.length; i++) {
            modifiedArr[i] = arr[i];
        }

        return modifiedArr;
    }

    static void addAEleToArr(int arr[], int element) {
        int modifiedArr[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            modifiedArr[i] = arr[i];
        }
        modifiedArr[modifiedArr.length - 1] = element;

        arr= modifiedArr;

    }

    static int generateRandom(int limit) {
        return (int) (Math.random() * Math.pow(10, Math.random() * 10)) % limit;
    }

    static void randomSwap(int arr[]) {
        int index1 = generateRandom(arr.length), index2 = generateRandom(arr.length);

        // System.out.printf("%d,%d\n",index1,index2);
        if (index1 == index2) {
            return;
        }

        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }

    static void shuffle(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            randomSwap(arr);
            // System.out.println(Arrays.toString(arr));
        }

    }

}
