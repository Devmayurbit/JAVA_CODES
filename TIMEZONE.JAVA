import java.util.TimeZone;
public class TIMEZONE {
    public static void main(String[] args) {
    TimeZone tz = TimeZone.getDefault();
    System.out.println("Current Time Zone: " + tz.getID());
    }
}
