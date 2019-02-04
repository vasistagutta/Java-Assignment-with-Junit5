package junittests.eventtests;

import org.junit.jupiter.api.Test;

import assignment.Date;
import assignment.Event;

class TestGetters {

    private static Event event;
    private static Date date;

    @Test
    public void test_get_date() {
	date = new Date(2014, 8, 28);
	event = new Event(date, 10, 12, "event 1");
	assert (event.getDate().equals(date));
    }

    @Test
    public void test_get_start() {
	date = new Date(2014, 8, 28);
	event = new Event(date, 10, 12, "event 1");
	assert (event.getStart() == 10);
    }

    @Test
    public void test_get_start_random() {
	for (int i = 0; i < 1000; i++) {
	    int start = (int) (Math.random() * 22);
	    date = new Date(2014, 8, 28);
	    event = new Event(date, start, 23, "event 1");
	    assert (event.getStart() == start);
	}
    }

    @Test
    public void test_get_end() {
	date = new Date(2014, 8, 28);
	event = new Event(date, 10, 12, "event 1");
	assert (event.getEnd() == 12);
    }

    @Test
    public void test_get_end_random() {
	for (int i = 0; i < 1000; i++) {
	    int end = (int) (Math.random() * 23) + 1;
	    date = new Date(2014, 8, 28);
	    event = new Event(date, 0, end, "event 1");
	    assert (event.getEnd() == end);
	}
    }

    @Test
    public void test_get_description() {
	date = new Date(2014, 8, 28);
	event = new Event(date, 10, 12, "event 1");
	assert (event.getDescription().equals("event 1"));
    }

}
