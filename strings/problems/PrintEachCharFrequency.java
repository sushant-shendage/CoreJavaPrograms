class PrintEachCharFrequency{
    public static void main(String[] args) {
        String s1="sushantsushant";
        int count=0;

        for (int i = 0; i < s1.length(); i++){
            count=0;
            for (int j = 0; j < s1.length(); j++){
                if (i==j) continue;
                if (s1.charAt(i)==s1.charAt(j))
                count++;
            }
            System.out.printf("\n%c : %d",s1.charAt(i),count);
            s1=s1.replace(s1.charAt(i)+"","");
           
        }
       

    }
}