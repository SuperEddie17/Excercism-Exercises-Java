import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        // Definování formátu pro parsování vstupního řetězce
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        // Načtení řetězce na LocalDateTime objekt
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDateDescription, parser);

        // Definování formátu pro výstupní řetězec
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("yyyy, MM, dd, HH, mm, ss");

        // Formátování LocalDateTime objektu na řetězec podle zadaného formátu
        String formattedDate = printer.format(dateTime);

        // Vracení objektu LocalDateTime
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        if (appointmentDate.isBefore(LocalDateTime.now())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalDateTime noon = appointmentDate.toLocalDate().atTime(12, 0);
        LocalDateTime evening = appointmentDate.toLocalDate().atTime(18, 0);

        return !appointmentDate.isBefore(noon) && appointmentDate.isBefore(evening);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // Definování formátu pro popis schůzky
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.ENGLISH);

        // Formátování LocalDateTime objektu na popis schůzky
        String description = formatter.format(appointmentDate);

        // Vracení popisu schůzky
        return description;
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();

        LocalDate anniversaryDate = LocalDate.of(currentYear, 9, 15);

        return anniversaryDate;
    }
}
