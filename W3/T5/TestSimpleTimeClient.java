import java.time.*;
import java.lang.*;
import java.util.*;
interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                        int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
public class TestSimpleTimeClient implements Clo{
    public static class SimpleTimeClient implements TimeClient,Cloneable {

    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {

        dateAndTime = LocalDateTime.now();
    }

    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    public String toString() {
        return dateAndTime.toString();
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
    public static void main(String... args) throws CloneNotSupportedException{
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
        TimeClient neighborTimeClient = (TimeClient) ((SimpleTimeClient) myTimeClient).clone();
        System.out.println("Check Equal myTimeClient and neighborTimeClient: "+ Objects.equals(myTimeClient,neighborTimeClient));
        System.out.println(neighborTimeClient.getLocalDateTime());
        neighborTimeClient.setTime(5,5,5);
        System.out.println(neighborTimeClient.getLocalDateTime());
        neighborTimeClient.setDate(2005,5,22);
        System.out.println(neighborTimeClient.getLocalDateTime());
        System.out.println("GetClass neighbortimeclient: " + neighborTimeClient.getClass());
        System.out.println("Hash code of neighborTimeClient: "+ neighborTimeClient.hashCode());


    }
}

