package junittests.eventtests;

import org.junit.jupiter.api.Test;

import assignment.Date;
import assignment.Event;

class TestEquals {

    private Date date;
    private Event event1, event2;

    @Test
    public void test_unequal_events_different_starts() {
	date = new Date(2014, 8, 28);
	event1 = new Event(date, 10, 12, "event 1");
	event2 = new Event(date, 12, 12, "event 1");
	assert (!event1.equals(event2));
    }

    @Test
    public void test_unequal_events_different_random_starts() {
	for (int i = 0; i < 1000; i++) {
	    int start1 = (int) (Math.random() * 12);
	    int start2 = (int) (Math.random() * 12) + 12;
	    date = new Date(2014, 8, 28);
	    event1 = new Event(date, start1, 23, "event 1");
	    event2 = new Event(date, start2, 23, "event 1");
	    assert (!event1.equals(event2));
	}
    }

    @Test
    public void test_unequal_events_different_ends() {
	date = new Date(2014, 8, 28);
	event1 = new Event(date, 9, 10, "event 1");
	event2 = new Event(date, 9, 12, "event 1");
	assert (!event1.equals(event2));
    }

    @Test
    public void test_unequal_events_different_random_ends() {
	for (int i = 0; i < 1000; i++) {
	    int end1 = (int) (Math.random() * 11) + 1;
	    int end2 = (int) (Math.random() * 12) + 12;
	    date = new Date(2014, 8, 28);
	    event1 = new Event(date, 0, end1, "event 1");
	    event2 = new Event(date, 0, end2, "event 1");
	    assert (!event1.equals(event2));
	}
    }

    @Test
    public void test_unequal_events_different_dates() {
	date = new Date(2014, 8, 28);
	Date d2 = new Date(2016, 3, 15);
	event1 = new Event(date, 12, 12, "event 1");
	event2 = new Event(d2, 12, 12, "event 1");
	assert (!event1.equals(event2));
    }

    @Test
    public void test_unequal_events_different_descriptions() {
	date = new Date(2014, 8, 28);
	event1 = new Event(date, 12, 12, "event 1");
	event2 = new Event(date, 12, 12, "event 2");
	assert (!event1.equals(event2));
    }

    @Test
    public void test_equal_events() {
	date = new Date(2014, 8, 28);
	event1 = new Event(date, 10, 12, "some events");
	event2 = new Event(date, 10, 12, "some events");
	assert (event1.equals(event2));
    }

}
