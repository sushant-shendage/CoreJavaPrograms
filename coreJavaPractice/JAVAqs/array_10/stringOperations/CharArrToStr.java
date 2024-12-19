public class CharArrToStr {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};

        String s1=new String(ch);//way 1-most efficient
        String s2=String.valueOf(ch);//way 2
        String s3="";//less efficient 4 objects are created

        for (int i = 0; i < ch.length; i++) {
            s3+=ch[i];
        }


        System.out.println("way1 :: "+s1);
        System.out.println("way2 :: "+s2);
        System.out.println("way3 :: "+s3);
    }
    
}
