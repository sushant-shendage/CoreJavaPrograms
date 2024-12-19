package javapgms.java8.practicals.lambadaExpressionAndFunctionalInterface_01;
public class Driver3 {
    public static void main(String[] args) {
        Voter var1= a-> (a>18)?"is eligible for voating":"not eligible for voating";
        System.out.println(var1.printVoterOrNot(19));
        System.out.println(var1.printVoterOrNot(15));

        Discount var2=a-> (a>60)?"Your are eligible for discount":"Your are not eligible for discount";
        System.out.println(var2.printDiscountMsg(99));
        System.out.println(var2.printDiscountMsg(15));

        Authorization var3=a-> (a.toLowerCase().equals("admin"))?"You are Authorized..!":"You are not Authorized..!";
        System.out.println(var3.printAuthorizationMsg("Admin"));
        System.out.println(var3.printAuthorizationMsg("team lead"));
    }
}
@FunctionalInterface
 interface Voter {
    String printVoterOrNot(int age);
}
@FunctionalInterface
 interface Discount {
    String printDiscountMsg(int age);
}
@FunctionalInterface
 interface Authorization {
    String printAuthorizationMsg(String roleName );
}