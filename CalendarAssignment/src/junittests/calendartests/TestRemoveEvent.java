package junittests.calendartests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import assignment.Calendar;
import assignment.Date;
import assignment.Event;

class TestRemoveEvent {

    private static Calendar c;
    private static Date d = new Date(2016, 4, 16);

    @Test
    public void test_remove_existing_event() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	Event e2 = new Event(d, 12, 14, "event 2");
	Event e3 = new Event(d, 14, 15, "event 3");
	c.addEvent(e1);
	c.addEvent(e2);
	c.addEvent(e3);
	assertEquals(c.removeEvent(e3), true);
    }

    /*
     * Tries to remove an event from an empty Calendar.
     * 
     * Fails if anything else but false is returned.
     */
    @Test
    public void test_remove_event_empty() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	assertEquals(c.removeEvent(e1), false);
    }

    /*
     * Tries to remove an event that isn't in the calendar.
     * 
     * Fails if anything else but false is returned.
     */
    @Test
    public void test_remove_event_not_there() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	Event e2 = new Event(d, 12, 14, "event 2");
	c.addEvent(e1);
	assertEquals(c.removeEvent(e2), false);
    }

}
