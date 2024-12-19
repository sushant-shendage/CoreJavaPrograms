import java.util.Scanner;

public class SQLqueryGeneratorV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[*]--:[welcome to query generator]:--[*]");

        System.out.println("Enter table name : ");
        String tableName = sc.nextLine();

        System.out.println("Enter total number of columns present in table name : ");
        int totalColumns = sc.nextInt();

        System.out.println("total number of columns present in the " + tableName + "  table : " + totalColumns);

        
        System.out.println("]--:[welcome to query generator]:--[");
        String loopVar="";
                do{
                    loopVar=sc.nextLine();
                switch (loopVar) 
                {
                    case "~fetch table data :":
                    {
                        fetchTableData(sc.nextLine());
                        System.out.println("------------------------------------");
                        break;
                    }
                    // case "~ write insert query ":
                    // {
                    //     // insertTableData(tableName);
                    //     System.out.println("------------------------------------");
                    //     break;
                    // }
                    case "~exit":
                    {
                         return;
                    }
                
                     
                }
                }while (loopVar!="exit");
        

        System.out.println("--->please reinitilze program..!");
    }



    static void fetchTableData(String tableName) {
        System.out.println("select * from " + tableName + ";");
    }

    static void insertTableData(String tableName)
    {
        // for (int i = ; i < array.length; i++) {
            
        // }

    }

}
