package junittests.eventtests;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import assignment.Date;
import assignment.Event;

class TestConstructor {

    private Date date;

    @Test
    public void test_invalid_event_start_less_than_0() {
	date = new Date(2014, 8, 28);
	assertThrows(IllegalArgumentException.class, () -> new Event(date, -5, 12, "some events"));
    }

    @Test
    public void test_invalid_event_start_greater_than_23() {
	date = new Date(2014, 8, 28);
	assertThrows(IllegalArgumentException.class, () -> new Event(date, 26, 30, "some events"));
    }

    @Test
    public void test_invalid_event_end_less_than_0() {
	date = new Date(2014, 8, 28);
	assertThrows(IllegalArgumentException.class, () -> new Event(date, 1, -8, "some events"));
    }

    @Test
    public void test_invalid_event_end_greater_than_23() {
	date = new Date(2014, 8, 28);
	assertThrows(IllegalArgumentException.class, () -> new Event(date, 1, 26, "some events"));
    }

    @Test
    public void test_invalid_event_start_greater_than_end() {
	date = new Date(2014, 8, 28);
	assertThrows(IllegalArgumentException.class, () -> new Event(date, 14, 12, "some events"));
    }
}
