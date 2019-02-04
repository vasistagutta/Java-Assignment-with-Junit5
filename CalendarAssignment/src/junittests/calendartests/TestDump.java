package junittests.calendartests;

import org.junit.jupiter.api.Test;

import assignment.Calendar;
import assignment.Date;
import assignment.Event;

class TestDump {

    private static Calendar c;
    private static Event e;
    private static Date d;

    // Check Console for test
    @Test
    public void test_output_of_print() {
	d = new Date(2014, 8, 28);
	e = new Event(d, 10, 12, "event 1");
	System.out.println("******************Testing the Calendar Class********************");
	System.out.println("Testing the dump of a calendar.");
	c = new Calendar();
	c.addEvent(e);
	System.out.println("Your program should print:\n8/28/2014 10--12:event 1");

	System.out.println("This is what your program printed: ");
	c.dump();
    }
}
