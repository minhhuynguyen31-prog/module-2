import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class DateUtils {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String getNextDay(String inputDate) throws DateTimeParseException {
        // Hàm này sẽ ném ra DateTimeParseException nếu chuỗi sai định dạng hoặc ngày không hợp lệ
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate nextDay = date.plusDays(1);
        return nextDay.format(formatter);
    }
}
