package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
    public static void main(String[] args) {
        LocalDate myDate= LocalDate.now();
        System.out.println(myDate);

        // current time
        LocalTime myTime=LocalTime.now();

        System.out.println(myTime);
        // current date and time

        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println("Before format: "+myDateTime);

        DateTimeFormatter modDateFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String modDateTime=myDateTime.format(modDateFormat);

        System.out.println("After format: "+modDateTime);

        DateTimeFormatter date2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String modDate2=myDateTime.format(date2);
        System.out.println("second date: "+modDate2);

        DateTimeFormatter date3=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String modDate3=myDateTime.format(date3);
        System.out.println("third date: "+modDate3);

        DateTimeFormatter date4=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String modDate4=myDateTime.format(date4);
        System.out.println("fourth date: "+modDate4);


        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateStr="26/04/2023";
        LocalDate date =LocalDate.parse(dateStr,format);
        System.out.println(date);
    }
}

// yyyy-mm-dd
//dd/mm/yyyy
// dd-MMM-yyyy
// E, MMM dd yyyy