import java.time.LocalDate;
import java.time.Period;

public class Driver3Period_timeQuantity {
    public static void main(String[] args) {
        LocalDate startingDate = LocalDate.of(2000,4,6);
        LocalDate endingDate = LocalDate.of(2025,1,10);

        Period p=Period.between(startingDate, endingDate);

        System.out.println(p);
        //-----------------------------------
        System.out.println("year   : "+p.getYears());
        System.out.println("month  : "+p.getMonths());
        System.out.println("days   : "+p.getDays());
        //-----------------------------------

        int yyyy=Period.between(startingDate, endingDate).getYears();
        //printing age using Period-class
        System.out.printf("I am %d years old..!",yyyy);
        System.out.printf("\nYears remaining %d..!",70-yyyy);


    }
}