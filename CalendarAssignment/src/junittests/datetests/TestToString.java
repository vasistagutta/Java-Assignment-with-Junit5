package junittests.datetests;

import org.junit.jupiter.api.Test;

import assignment.Date;

class TestToString {

    private Date date;

    /**
     * You must look at the console to check the correctness of this.
     */
    @Test
    public void test_to_string() {
	date = new Date(2017, 8, 23);
	System.out.println("Testing Date toString Method");
	System.out.println("Date should be 8/23/2017");
	System.out.println("Your date: " + date);
    }

}
