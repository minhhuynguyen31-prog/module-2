import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    @Test
    void getNextDay() {
        assertEquals("16/05/2026", DateUtils.getNextDay("15/05/2026"));
    }
    @Test
    void testEndOf30DayMonth() {
        assertEquals("01/05/2026", DateUtils.getNextDay("30/04/2026"));
    }

    @Test
    void testEndOf31DayMonth() {
        assertEquals("01/08/2026", DateUtils.getNextDay("31/07/2026"));
    }

    @Test
    void testEndOfYear() {
        assertEquals("01/01/2027", DateUtils.getNextDay("31/12/2026"));
    }

    @Test
    void testFebNonLeapYear() {
        assertEquals("01/03/2026", DateUtils.getNextDay("28/02/2026"));
    }

    @Test
    void testFebLeapYear() {
        assertEquals("29/02/2024", DateUtils.getNextDay("28/02/2024"));
        assertEquals("01/03/2024", DateUtils.getNextDay("29/02/2024"));
    }

    @Test
    void testInvalidFormat() {
        assertThrows(DateTimeParseException.class, () -> DateUtils.getNextDay("15-05-2026"));
        assertThrows(DateTimeParseException.class, () -> DateUtils.getNextDay("5/5/2026"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(DateTimeParseException.class, () -> DateUtils.getNextDay("29/02/2026")); // 2026 không nhuận
        assertThrows(DateTimeParseException.class, () -> DateUtils.getNextDay("31/06/2026")); // Tháng 6 có 30 ngày
        assertThrows(DateTimeParseException.class, () -> DateUtils.getNextDay("32/12/2026"));
    }
}