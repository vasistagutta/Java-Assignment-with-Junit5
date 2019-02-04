package junittests.datetests;



import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import assignment.Date;

class TestConstructor {

    /**
     * This test creates an invalid date object with an invalid year that should
     * throw an IllegalArgumentException.
     * 
     * If no exception is thrown then the test fails.
     */
    @Test
    public void test_invalid_year_2012() {
	assertThrows(IllegalArgumentException.class, () -> new Date(2012, 8, 28));
    }

    /**
     * This test creates an invalid date object with an invalid year that should
     * throw an IllegalArgumentException.
     * 
     * If no exception is thrown then the test fails.
     */
    @Test
    public void test_invalid_year_2021() {
	assertThrows(IllegalArgumentException.class, () -> new Date(2021, 8, 28));
    }

    /**
     * This test creates an invalid date object with an invalid month that should
     * throw an IllegalArgumentException.
     * 
     * If no exception is thrown then the test fails.
     */
    @Test
    public void test_invalid_month_0() {
	assertThrows(IllegalArgumentException.class, () -> new Date(2014, 0, 28));
    }

    /**
     * This test creates an invalid date object with an invalid month that should
     * throw an IllegalArgumentException.
     * 
     * If no exception is thrown then the test fails.
     */
    @Test
    public void test_invalid_month_13() {
	assertThrows(IllegalArgumentException.class, () -> new Date(2014, 13, 28));
    }

    /**
     * This test creates an invalid date object with an invalid day that should
     * throw an IllegalArgumentException.
     * 
     * If no exception is thrown then the test fails.
     */
    @Test
    public void test_invalid_day_0() {
	assertThrows(IllegalArgumentException.class, () -> new Date(2014, 12, 0));
    }

    /**
     * This test creates an invalid date object with an invalid day that should
     * throw an IllegalArgumentException.
     * 
     * If no exception is thrown then the test fails.
     */
    @Test
    public void test_invalid_day_33() {
	assertThrows(IllegalArgumentException.class, () -> new Date(2014, 12, 33));
    }

    /**
     * This test creates a valid date object.
     * 
     * If an exception is thrown the test fails.
     */
    @Test
    public void test_valid_date() {
	new Date(2015, 8, 28);
    }

}
