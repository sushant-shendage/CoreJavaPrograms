import java.util.Scanner;

public class BankingEncapsulation {

    private String userName = "sushantSS";
    private String bankName = "xyz bank";
    private String accountNumber = "89eehietiu4";
    private double accountBal = 20000.86;
    private int pin = 5678;

    void initiateTransaction() {

        Scanner sc = new Scanner(System.in);

        int userEnteredPin = 0;

        int opearationCode=0;
        for (;opearationCode>=0;) {
            System.out.println("enter pin : ");
            userEnteredPin = sc.nextInt();

            if (userEnteredPin == pin) 
            {
               
               accountInfo();

                while (opearationCode>=0) {
                    System.out.println("enter operation code : ");
                    opearationCode = sc.nextInt();
                    trancationOperation(opearationCode);
                }

            } else {
                System.out.println("invalid pin try again");
            }
        }
         System.out.println("function transaction operations completed...!");
    }

    void depositeProcess() {
        Scanner sc = new Scanner(System.in);
        int deposite = 0;

        for (;;) {
            System.out.println("Please enter amont less than or equal to 15000");
            System.out.println("Enter deposite amount : ");
            deposite = sc.nextInt();

            if (deposite > 0 && deposite <= 15000) {
                accountBal += deposite;
                break;
            } else {
                System.out.println("Please enter amont as per given instruction ");
            }
        }
        return;
    }

    void withdrowProcess() {
        Scanner sc = new Scanner(System.in);
        int withdrow = 0;

        for (;;) {
            System.out.println("Please enter amont less than or equal to 10000 and multiple of 100");
            System.out.println("Enter withdrow amount : ");
            withdrow = sc.nextInt();

            if (withdrow > accountBal) {
                System.out.println("insufficent balance...!");
                break;
            }

            if (withdrow > 0 && withdrow <= 15000 && withdrow % 100 == 0) {

                accountBal -= withdrow;

                System.out.println("****Recepts****");
                System.out.println("Bank name         :: " + bankName);
                System.out.println("User Name         :: " + userName);
                System.out.println("balance remaining :: " + accountBal);

                break;
            } else {
                System.out.println("Please enter amont as per given instruction ");
            }
        }
    }
    void accountInfo()
    {
        System.out.println("valid pin");

        System.out.println(" ac no :" + accountNumber);
        System.out.println("user : " + userName);

        System.out.println("[OPERATION CODE : OPERATION    ]");
        System.out.println("[             1 : Show balance ]");
        System.out.println("[             2 : Deposite     ]");
        System.out.println("[             3 : Withdrow     ]");

    }
    void trancationOperation(int opearationCode)
    {
        switch (opearationCode) {
            case 1: {
                System.out.println("current balnce : " + accountBal);
                break;
            }
            case 2: {

                depositeProcess();
                break;

            }
            case 3: {
                withdrowProcess();
                break;
            }
            case 4: {
                changePinProcess(pin,opearationCode);
                break;
            }

            default: {
                System.out.println("Enter valid opearation code");
                break;
            }
        }
    }
    void changePinProcess(int currentPin,int opearationCode)
    {
        Scanner sc=new Scanner(System.in);
        int cPin=0;
         for (; ;) {
            System.out.println("Please enter your correct current pin :");
        cPin = sc.nextInt(); 

        if (cPin==pin) {
            System.out.println("Please enter new pin :");
            pin=sc.nextInt();
            System.out.println("Your new pin : "+pin);
             initiateTransaction();
            
            break;
        }
        else{
            System.out.println("u have enetered incorrect pin..!");
        }

         }
        
    }
}
