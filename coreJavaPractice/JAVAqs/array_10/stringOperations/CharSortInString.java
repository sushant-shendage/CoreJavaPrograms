public class CharSortInString {
    public static void main(String[] args) {

        String s1="GgFfEeDdCcbBaA";
        
       char ch[]=new char[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
             ch[i]=s1.charAt(i);
        }
        char temp;
        
        System.out.println(ch);

        for (int j = 0; j < ch.length; j++) {
            for (int i = 0; i < ch.length-1; i++) {
                // ch[i]=s1.charAt(i);
    
                if (ch[i]>ch[i+1]) 
                {
                   temp=ch[i];
                   ch[i]=ch[i+1];
                   ch[i+1]=temp;
                   //System.out.println(ch);
                }
           }
        }

       System.out.println(ch);

       arrCharSort("ihgfedcba");
        
    }
    static void arrCharSort(String s1)
    {
         
        
       char ch[]=new char[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
             ch[i]=s1.charAt(i);
        }
        char temp;
        
        System.out.println(ch);

        for (int j = 0; j < ch.length; j++) {
            for (int i = 0; i < ch.length-1; i++) {
                // ch[i]=s1.charAt(i);
    
                if (ch[i]>ch[i+1]) 
                {
                   temp=ch[i];
                   ch[i]=ch[i+1];
                   ch[i+1]=temp;
                   //System.out.println(ch);
                }
           }
        }

       System.out.println(ch);
        

    }
    
}
