package junittests.eventtests;

import org.junit.jupiter.api.Test;

import assignment.Date;
import assignment.Event;

class TestSetter {

    private static Event event;
    private static Date date;

    @Test
    public void test_set_description() {
	date = new Date(2014, 8, 28);
	event = new Event(date, 10, 12, "event 1");
	event.setDescription("New event update");
	assert (event.getDescription().equals("New event update"));
    }

}
