import java.util.Arrays;

public class AlgoD2V2 {
    public static void main(String[] args) {

        String s1 = "hi";

        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            s2 += s1.charAt(i) +1-1 + ".";
        }
        System.out.println("e1:");
        System.out.println(s2);

        String s3 = "";

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == '0') {
                if (i % 2 == 0) {//FAILED...!
                    s3 += "1";// 11
                } else {
                    s3 += ""; // 11
                }
            } else if (s2.charAt(i) == '1') {

                if (i % 2 == 0) {
                    s3 += "n3O27e";// 12
                } else {
                    s3 += "8W3tO1"; // 12
                }
            } else if (s2.charAt(i) == '2') {
                if (i % 2 == 0) {
                    s3 += "3w12T12o13"; // 13
                } else {
                    s3 += "E1t7E5rH";// 13
                }
            } else if (s2.charAt(i) == '3') {
                if (i % 2 == 0) {
                    s3 += "e4T55eRh";// 14
                } else {
                    s3 += "R123o2F6u";// 14
                }

            } else if (s2.charAt(i) == '4') {
                if (i % 2 == 0) {
                    s3 += "r5O221f5U";// 15
                } else {
                    s3 += "E33i3V33f";// 15
                }

            } else if (s2.charAt(i) == '5') {
                if (i % 2 == 0) {
                    s3 += "e24I4v6F";// 16
                } else {
                    s3 += "I37sX339";// 16
                }
            } else if (s2.charAt(i) == '6') {
                if (i % 2 == 0) {
                    s3 += "i42S41x42";// 17
                } else {
                    s3 += "Ve33NeS47";// 17
                }
            } else if (s2.charAt(i) == '7') {
                if (i % 2 == 0) {
                    s3 += "i48S06x0";// 18,x0
                } else {
                    s3 += "G11t310I30h54E";// 18,4E
                }
            } else if (s2.charAt(i) == '8') {
                if (i % 2 == 0) {
                    s3 += "g3T67i2H1e0";// 19,e0
                } else {
                    s3 += "I61e62N1n3";// 19,n3
                }
            } else if (s2.charAt(i) == '9') {
                if (i % 2 == 0) {
                    s3 += "i1E1n66N6";// 20,N6
                } else {
                    s3 += "R76e7z0O0";// 44,O0
                }
            } else if (s2.charAt(i) == '.') {
                if (i % 2 == 0) {
                    s3 += "d72T73o74I75s76x77";// 69,77
                } else {
                    s3 += "d78T79o80W81t82o83";// numsum=69,83
                }

            }

        }

        System.out.println("e3 :");
        System.out.println(s3);

        int sum=0;
        String s4="";
        char s5=' ';
        for (int j = 0; j < s3.length()-1; j++) {

            if (s3.charAt(j)=='7' && s3.charAt(j+1)=='7') {
                System.out.print(sum+",");
                sum=0;
            }
            if (s3.charAt(j)=='8' && s3.charAt(j+1)=='3') {
                 
                System.out.print(sum+",");
                sum=0;
            }
            
            if (s3.charAt(j)>='0' && s3.charAt(j)<='9') {
                 sum+=s3.charAt(j)-48;
                 
            }

           
        }
       

    }

}
