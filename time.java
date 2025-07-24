 import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Currentdatetime {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define format for date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format and print
        String formattedDateTime = now.format(formatter);
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}           