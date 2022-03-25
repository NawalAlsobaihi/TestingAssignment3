import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class TrainTicket {

    public char BookTicket(String TicketTime) {

        LocalTime target = LocalTime.parse( TicketTime ) ;
        Boolean timeZone1 = (
                target.isAfter( LocalTime.parse( "09:29:00" ) )
                        &&
                        target.isBefore( LocalTime.parse( "16:00:01" ) )) ;

        if(timeZone1 == true)
            return 'S';


     else if(target.isAfter( LocalTime.parse( "16:00:00" ) ) && target.isBefore( LocalTime.parse( "19:31:00" ) ))
         return 'F';

        else if(target.isAfter( LocalTime.parse( "19:30:00" ) ) && target.isBefore( LocalTime.parse( "22:06:00" ) ))
            return 'S';




        return 'F';
    }
}
