package PackageBuilt;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Time {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();           // today's date
        LocalTime time = LocalTime.now();           // current time
        LocalDateTime dateTime = LocalDateTime.now(); // date + time

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Date & Time: " + dateTime);
    }
}
