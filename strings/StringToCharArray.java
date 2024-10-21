import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String str="abcdefgh";


        //string -->char array    :[approch 1]:using for loop
        char strCharArr[]=new char[str.length()] ;
        for (int i = 0; i < str.length(); i++) {
            strCharArr[i]+=str.charAt(i);
        }
        System.out.println("char arr ::"+Arrays.toString(strCharArr));

        //string -->char array    :[approch 2]:using inbuilt fx
        System.out.println("char arr ::"+Arrays.toString(str.toCharArray()));


        //char array-->string    :[approch 1]:using inbuilt fx

        System.out.println(new String(str.toCharArray()));

        


    }
    
}
