package junittests.datetests;

import org.junit.jupiter.api.Test;

import assignment.Date;

class TestEquals {

    private Date d1, d2;

    /**
     * This tests the equals method two non equal Date objects in which their years
     * are different.
     * 
     * If true is returned by the equals method the test fails.
     */
    @Test
    public void test_non_equal_dates_year() {
	d1 = new Date(2014, 8, 28);
	d2 = new Date(2015, 8, 28);
	assert (!d1.equals(d2));
    }

    @Test
    public void test_non_equal_random_years() {
	for (int i = 0; i < 1000; i++) {
	    // random between 2014 and 2017 inclusive
	    int year1 = (int) (Math.random() * 4) + 2014;
	    // random between 2018 and 2020 inclusive
	    int year2 = (int) (Math.random() * 3) + 2018;
	    d1 = new Date(year1, 8, 28);
	    d2 = new Date(year2, 8, 28);
	    assert (!d1.equals(d2));
	}
    }

    /**
     * This tests the equals method two non equal Date objects in which their months
     * are different.
     * 
     * If true is returned by the equals method the test fails.
     */
    @Test
    public void test_non_equal_dates_months() {
	d1 = new Date(2014, 9, 28);
	d2 = new Date(2014, 8, 28);
	assert (!d1.equals(d2));
    }

    @Test
    public void test_non_equal_random_months() {
	for (int i = 0; i < 1000; i++) {
	    // random between 1 and 6 inclusive
	    int month1 = (int) (Math.random() * 6) + 1;
	    // random between 7 and 12 inclusive
	    int month2 = (int) (Math.random() * 6) + 7;
	    d1 = new Date(2014, month1, 28);
	    d2 = new Date(2014, month2, 28);
	    assert (!d1.equals(d2));
	}
    }

    /**
     * This tests the equals method two non equal Date objects in which their days
     * are different.
     * 
     * If true is returned by the equals method the test fails.
     */
    @Test
    public void test_non_equal_dates_days() {
	d1 = new Date(2014, 9, 28);
	d2 = new Date(2014, 9, 15);
	assert (!d1.equals(d2));
    }

    @Test
    public void test_non_equal_random_days() {
	for (int i = 0; i < 1000; i++) {
	    // random between 1 and 15 inclusive
	    int day1 = (int) (Math.random() * 15) + 1;
	    // random between 16 and 31 inclusive
	    int day2 = (int) (Math.random() * 16) + 16;
	    d1 = new Date(2014, 8, day1);
	    d2 = new Date(2014, 8, day2);
	    assert (!d1.equals(d2));
	}
    }

    /**
     * This test tests the equals method of two equal Date objects.
     * 
     * If false is returned by the equals method the test fails.
     */
    @Test
    public void test_equal_dates() {
	d1 = new Date(2014, 8, 28);
	d2 = new Date(2014, 8, 28);
	assert (d1.equals(d2));
    }
}
