//https://help.gooddata.com/cloudconnect/manual/date-and-time-format.html
//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.lang.String;

public class time {
    public static void main(String[] args) {
        //get time zone
        Clock time_instant = Clock.systemUTC();
        Clock time_zone = Clock.systemDefaultZone();
        System.out.println("You are in the " + time_zone.getZone() + " timezone");
        /*if you get the error that you are defining a non-static variable in a static method
          then you have to set your variable to Clock.systemUTC() first so that it knows
          where to get the information from*/
        //get current instant
        date();
        time();
    }

    public static void date(){
        DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("'Today is 'MMMM,' 'E' the 'D, YYYY");   // This method formats the raw date input by giving you just the day
        LocalDate today = LocalDate.now();    			// This gives you the raw date
        String date = date_formatter.format(today);	   // This puts the raw date thought the formatter so that you only get the day
		System.out.println(date);                     //This prints the day
    }

    public static void time(){
        DateTimeFormatter time_formatter = DateTimeFormatter.ofPattern("'The time is' KK:mm a");
        /*Formatted for hour of the day (kk), minute of the hour (mm), and second of the minute (ss),
        it also says am or pm (a) which is unnecessary given that it is military time*/
        LocalTime now = LocalTime.now();
        String time = time_formatter.format(now);
		System.out.println(time);
    }
}
