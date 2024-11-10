// package javapgms.strings;

public class RemoveCharInString {
    public static void main(String[] args) {
        String str1 = "this is string rrrrrr";
        char target='r';

        String str2 = str1.replace("r", "");

        String str3="";

        System.out.println("Given string :"+str1);
        System.out.println("updated string :"+str2);



        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)=='r'){
                    continue;   
            }
            str3+=str1.charAt(i);
        }
        System.out.println("updated string :"+str3);

    }

     
}
