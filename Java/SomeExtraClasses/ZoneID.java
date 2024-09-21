import java.time.ZoneId;
import java.util.Set;

public class ZoneID {
    public static void main(String[] args) {
        // Getting the system default time zone
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("Default Time Zone: " + defaultZone);

        // Getting available time zones
        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        System.out.println("Available Time Zones: " + availableZones);
    }
}
