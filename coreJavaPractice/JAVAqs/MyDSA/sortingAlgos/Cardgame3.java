import java.util.Arrays;
 
public class Cardgame3 {
    public static int[] cardSet;

    public static void main(String[] args) 
    {
        int cardSet[]=Cardgame3methods.originalSet();
        
        //SHUFFLING CARDS
        Cardgame3methods.shuffle(cardSet);
       
        //CARD SET TO PLAYER 1
        int player1Cards[]=Cardgame3methods.sixCardSet(cardSet);
        player1Cards=Cardgame.sortCardsAndPairStatus(player1Cards);
       
        
        for (int i = 0; i < player1Cards.length; i++) {
            cardSet=Cardgame3methods.remove(cardSet,player1Cards[i]);
        }

        // System.out.println("cardSet AFTER DISTRIBUTING CARD TO PLAYER1 :: "+Arrays.toString(cardSet));


         //CARD SET TO PLAYER 2
         int player2Cards[]=Cardgame3methods.sixCardSet(cardSet);
         player2Cards=Cardgame.sortCardsAndPairStatus(player2Cards);

        //  System.out.println("player2Cards :: "+Arrays.toString(player2Cards));
         
         for (int i = 0; i < player2Cards.length; i++) {
             cardSet=Cardgame3methods.remove(cardSet,player2Cards[i]);
         }
         
         System.out.println("cardSet AFTER DISTRIBUTING CARD TO PLAYER2 :: "+Arrays.toString(cardSet));
         System.out.println("player1Cards :: "+Arrays.toString(player1Cards));
         System.out.println("player1Cards :: "+Arrays.toString(player2Cards));
  
 
        
    }
   
}
