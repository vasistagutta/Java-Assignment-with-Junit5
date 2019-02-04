package junittests.datetests;

import org.junit.jupiter.api.Test;

import assignment.Date;

class TestCompareTo {

    private Date d1, d2;

    /**
     * This tests the compareTo method for Date objects in which a year is greater
     * than another year.
     * 
     * If anything less than or equal to zero is returned the test fails.
     */
    @Test
    public void test_compareto_years_greater_than_zero() {
	d1 = new Date(2015, 8, 28);
	d2 = new Date(2014, 8, 16);
	assert (d1.compareTo(d2) > 0);
    }

    @Test
    public void test_compareto_random_years_greater_than_zero() {
	for (int i = 0; i < 1000; i++) {
	    // random between 2014 and 2017 inclusive
	    int year1 = (int) (Math.random() * 4) + 2014;
	    // random between 2018 and 2020 inclusive
	    int year2 = (int) (Math.random() * 3) + 2018;
	    d1 = new Date(year1, 8, 28);
	    d2 = new Date(year2, 8, 28);
	    assert (d2.compareTo(d1) > 0);
	}
    }

    /**
     * This tests the compareTo method for Date objects in which a year is less than
     * another year.
     * 
     * If anything greater than or equal to zero is returned the test fails.
     */
    @Test
    public void test_compareto_years_less_than_zero() {
	d1 = new Date(2015, 8, 28);
	d2 = new Date(2014, 8, 16);
	assert (d2.compareTo(d1) < 0);
    }

    @Test
    public void test_compareto_random_years_less_than_zero() {
	for (int i = 0; i < 1000; i++) {
	    // random between 2014 and 2017 inclusive
	    int year1 = (int) (Math.random() * 4) + 2014;
	    // random between 2018 and 2020 inclusive
	    int year2 = (int) (Math.random() * 3) + 2018;
	    d1 = new Date(year1, 8, 28);
	    d2 = new Date(year2, 8, 28);
	    assert (d1.compareTo(d2) < 0);
	}
    }

    /**
     * This tests the compareTo method for Date objects in which a month is greater
     * than another month.
     * 
     * If anything less than or equal to zero is returned the test fails.
     */
    @Test
    public void test_compareto_months_greater_than_zero() {
	d1 = new Date(2014, 9, 28);
	d2 = new Date(2014, 8, 16);
	assert (d1.compareTo(d2) > 0);
    }

    @Test
    public void test_compareto_random_months_greater_than_zero() {
	for (int i = 0; i < 1000; i++) {
	    // random between 1 and 6 inclusive
	    int month1 = (int) (Math.random() * 6) + 1;
	    // random between 7 and 12 inclusive
	    int month2 = (int) (Math.random() * 6) + 7;
	    d1 = new Date(2014, month1, 28);
	    d2 = new Date(2014, month2, 28);
	    assert (d2.compareTo(d1) > 0);
	}
    }

    /**
     * This tests the compareTo method for Date objects in which a month is less
     * than another month.
     * 
     * If anything greater than or equal to zero is returned the test fails.
     */
    @Test
    public void test_compareto_months_less_than_zero() {
	d1 = new Date(2014, 9, 28);
	d2 = new Date(2014, 8, 16);
	assert (d2.compareTo(d1) < 0);
    }

    @Test
    public void test_compareto_random_months_less_than_zero() {
	for (int i = 0; i < 1000; i++) {
	    // random between 1 and 6 inclusive
	    int month1 = (int) (Math.random() * 6) + 1;
	    // random between 7 and 12 inclusive
	    int month2 = (int) (Math.random() * 6) + 7;
	    d1 = new Date(2014, month1, 28);
	    d2 = new Date(2014, month2, 28);
	    assert (d1.compareTo(d2) < 0);
	}
    }

    /**
     * This tests the compareTo method for Date objects in which a day is greater
     * than another day.
     * 
     * If anything less than or equal to zero is returned the test fails.
     */
    @Test
    public void test_compareto_days_greater_than_zero() {
	d1 = new Date(2014, 8, 28);
	d2 = new Date(2014, 8, 16);
	assert (d1.compareTo(d2) > 0);
    }

    @Test
    public void test_compareto_random_days_greater_than_zero() {
	for (int i = 0; i < 1000; i++) {
	    // random between 1 and 15 inclusive
	    int day1 = (int) (Math.random() * 15) + 1;
	    // random between 16 and 31 inclusive
	    int day2 = (int) (Math.random() * 16) + 16;
	    d1 = new Date(2014, 8, day1);
	    d2 = new Date(2014, 8, day2);
	    assert (d2.compareTo(d1) > 0);
	}
    }

    /**
     * This tests the compareTo method for Date objects in which a day is less than
     * another day.
     * 
     * If anything greater than or equal to zero is returned the test fails.
     */
    @Test
    public void test_compareto_days_less_than_zero() {
	d1 = new Date(2014, 8, 28);
	d2 = new Date(2014, 8, 16);
	assert (d2.compareTo(d1) < 0);
    }

    @Test
    public void test_compareto_random_days_less_than_zero() {
	for (int i = 0; i < 1000; i++) {
	    // random between 1 and 15 inclusive
	    int day1 = (int) (Math.random() * 15) + 1;
	    // random between 16 and 31 inclusive
	    int day2 = (int) (Math.random() * 16) + 16;
	    d1 = new Date(2014, 8, day1);
	    d2 = new Date(2014, 8, day2);
	    assert (d1.compareTo(d2) < 0);
	}
    }

    /**
     * This tests the compareTo method for two Dates that are the same.
     * 
     * If anything but 0 is returned the test fails.
     */
    @Test
    public void test_compareto_equal_zero() {
	d1 = new Date(2014, 8, 28);
	d2 = new Date(2014, 8, 28);
	assert (d1.compareTo(d2) == 0);
    }

}
