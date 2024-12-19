
import java.util.Scanner;

public class FriendExpence {
    public static void main(String[] args) 
    {

        int totalFriends=0;
        
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter total number of friends : ");
        totalFriends=sc.nextInt();

        int arr[]= new int[totalFriends];

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("The expence of "+(i+1)+" friend is ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Total number of friends : "+totalFriends);
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("The expence of "+(i+1)+" friend : "+arr[i]);
        }

    }
    
}
