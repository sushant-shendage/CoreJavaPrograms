public class randomListGenerator {
    // 5th set,24
    //random integer list generator within range
    //method structure listRan2DIntNum(int a,int b,int c)
    //--a:total how many number want to generate
    //--b:range starting point(inclusive)
    //--c:range ending point(inclusive)


    public static void main(String[] args) {
        listRan2DIntNum(10, 10, 20);
    }

   static void listRan2DIntNum(int total,int startingNum,int endingNum)
   {
    String name1Set[]={"ganesh","yuvraj", "tejas", "nitin", "deva", "sagar", "onkar", "nikhi", "sunil", "anil", "suresh", "haridas", "rajaram", "ankush", "ganesh", "dipak", "aryan", "aniket", "sahil", "rushikesh", "saurabh", "akhay", "avinash", "vishal","sandip", "ajay"};
    String name2Set[]={"patil","todakare", "roy", "kumar", "sharma", "warma", "god", "salunkhe", "pawar", "waghmare", "deshmukh", "ghode", "sasane", "gadhwe", "farnandis", "jundhale", "mhamane", "dhotre", "redy", "mane", "shongade", "jadhav", "teli", "vishal","kurne", "misal"};
    // System.out.println(name1Set.length);
    // System.out.println(name2Set.length);

    int randomInt1=0,randomInt2;
    for (int i = 1;i<=total ;i++) 
    {
         randomInt1=(int)(Math.random()*100)%endingNum;
         randomInt2=(int)(Math.random()*100)%endingNum;

        //  System.out.println(randomInt1);
        //  System.out.println(randomInt2);

    
    System.out.print(name1Set[randomInt1]+" "+name2Set[randomInt2]+"|");

  
    }
 
   }
}
