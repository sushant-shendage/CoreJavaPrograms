// package javapgms.dateAndtimeAPI;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Driver1 {
    public static void main(String[] args) {

        // LocalTime time1 = LocalTime.now();
        // System.out.println(time1);
        // System.out.println("getHour()   : " + time1.getHour());
        // System.out.println("getMinute() : " + time1.getMinute());
        // System.out.println("getSecond() : " + time1.getSecond());
        // System.out.println("getNano()   : " + time1.getNano());

        // System.out.printf("%d:::%d:::%d:::%d",time1.getHour(),time1.getMinute(),time1.getSecond(),time1.getNano());

        LocalDateTime LDT=LocalDateTime.now();
        System.out.println("\ntime and date :"+LDT);
        //-	getYear/MonthValue/dayOfMonth/Hour/Minute/Seconds()

     LDT=LocalDateTime.of(2000,1,25,4,44);
        System.out.println("\ntime and date :"+LDT);

        System.out.println(LDT.plusDays(1).plusDays(1) );

    }
}
