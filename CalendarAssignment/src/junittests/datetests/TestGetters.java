package junittests.datetests;

import org.junit.jupiter.api.Test;

import assignment.Date;

class TestGetters {

    private Date date;

    @Test
    public void test_get_year() {
	date = new Date(2017, 8, 23);
	assert (date.getYear() == 2017);
    }

    @Test
    public void test_get_year_random() {
	for (int i = 0; i < 1000; i++) {
	    int year = (int) (Math.random() * 7) + 2014;
	    date = new Date(year, 8, 28);
	    assert (date.getYear() == year);
	}
    }

    @Test
    public void test_get_month() {
	date = new Date(2017, 8, 23);
	assert (date.getMonth() == 8);
    }

    @Test
    public void test_get_month_random() {
	for (int i = 0; i < 1000; i++) {
	    int month = (int) (Math.random() * 12) + 1;
	    date = new Date(2014, month, 28);
	    assert (date.getMonth() == month);
	}
    }

    @Test
    public void test_get_day() {
	date = new Date(2017, 8, 23);
	assert (date.getDay() == 23);
    }

    @Test
    public void test_get_day_random() {
	for (int i = 0; i < 1000; i++) {
	    int day = (int) (Math.random() * 31) + 1;
	    date = new Date(2014, 8, day);
	    assert (date.getDay() == day);
	}
    }

}
