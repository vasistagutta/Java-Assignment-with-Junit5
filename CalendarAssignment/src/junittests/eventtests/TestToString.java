package junittests.eventtests;

import org.junit.jupiter.api.Test;

import assignment.Date;
import assignment.Event;

class TestToString {

    private Date date;
    private Event event;

    @Test
    public void test_to_string() {
	date = new Date(2014, 8, 28);
	event = new Event(date, 10, 12, "some events");
	System.out.println("Testing To String");
	System.out.println("Expected values: 8/28/2014 10 -- 12: some events");
	System.out.println("Your output: " + event);
    }

}
