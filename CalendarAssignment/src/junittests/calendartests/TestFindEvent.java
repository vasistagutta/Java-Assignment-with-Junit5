package junittests.calendartests;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import assignment.Calendar;
import assignment.Date;
import assignment.Event;

class TestFindEvent {

    private static Calendar c;
    private static Date d = new Date(2016, 4, 16);

    @Test
    public void test_find_existing_event() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	Event e2 = new Event(d, 12, 14, "event 2");
	c.addEvent(e1);
	c.addEvent(e2);
	assertEquals(c.findEvent(e2), 1);
    }

    /*
     * Tries to find an event in an empty Calendar.
     * 
     * Fails if anything else but -1 is returned.
     */
    @Test
    public void test_find_event_empty() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	assertEquals(c.findEvent(e1), -1);
    }

    /*
     * Tries to find an event that doesn't exist on a Calendar
     * 
     * Fails if anything but -1 is returned.
     */
    @Test
    public void test_find_event_not_there() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	Event e2 = new Event(d, 12, 14, "event 2");
	c.addEvent(e1);
	assertEquals(c.findEvent(e2), -1);
    }

}
