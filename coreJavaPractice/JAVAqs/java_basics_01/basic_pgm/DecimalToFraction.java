public class DecimalToFraction {
    public static void main(String[] args) {
        String a="123.84655";
        int count=0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='.') {
                 count++;
              break;
            }
            count++; 
        }
        int pfv=a.length()-count;
        System.out.println(count);
        System.out.println(pfv);

       
    }
    
}
