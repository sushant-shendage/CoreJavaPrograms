import java.util.Scanner;

public class SQLqueryGEnerator 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("]--:[welcome to query generator]:--[]");
String loopVar="";
        do{
            loopVar=sc.nextLine();
        switch (loopVar) 
        {
            case "~FTD":
            {
                System.out.println("Enter table name--------------------");
                fetchTableData(sc.nextLine());
                System.out.println("------------------------------------");


                break;
            }
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
}
