import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {

    private static long GIGASECONDS = 1000000000L;
    LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        dateTime = moment.atTime(LocalTime.MAX);
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds(GIGASECONDS);
    }
}
