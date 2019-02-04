package junittests.calendartests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import assignment.Calendar;
import assignment.Date;
import assignment.Event;

class TestAddEvent {

    private static Calendar c;
    private static Event e;
    private static Date d = new Date(2016, 4, 16);

    /*
     * Adds an event which should return true.
     * 
     * Fails if false or nothing is returned.
     */
    @Test
    public void test_add_an_event() {
	c = new Calendar();
	e = new Event(d, 10, 12, "event 1");
	assertEquals(c.addEvent(e), true);
    }
    

    /*
     * Adds an event after removing the middle event. Then checks to see if that
     * event was added in the proper spot.
     * 
     * Fails if the findEvent method returns anything but 1.
     */
    @Test
    public void test_add_event_in_middle() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	Event e2 = new Event(d, 12, 14, "event 2");
	Event e3 = new Event(d, 14, 15, "event 3");
	Event e4 = new Event(new Date(2014, 8, 15), 14, 15, "event 4");
	c.addEvent(e1);
	c.addEvent(e2);
	c.addEvent(e3);
	c.removeEvent(e2);
	c.addEvent(e4);
	assertEquals(c.findEvent(e4), 1);
    }

    /*
     * Tries to add an event to a calendar that is full.
     * 
     * Fails if anything but false is returned.
     */
    @Test
    public void test_add_to_full_calendar() {
	c = new Calendar();
	Event e1 = new Event(d, 10, 12, "event 1");
	Event e2 = new Event(d, 12, 14, "event 2");
	Event e3 = new Event(d, 14, 15, "event 3");
	Event e4 = new Event(new Date(2014, 8, 15), 14, 15, "event 4");
	c.addEvent(e1);
	c.addEvent(e2);
	c.addEvent(e3);
	c.addEvent(e4);
	assertEquals(c.addEvent(e1), false);
    }

}
