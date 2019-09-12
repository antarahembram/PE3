package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DateOfWeekTest {
    public static DateOfWeek dateOfWeek;


    @BeforeClass
    public static void setup() {

        dateOfWeek = new DateOfWeek();

    }

    @AfterClass
    public static void teardown() {

        dateOfWeek = null;

    }

    @Test
    public void returnFirstAndLastDayTest_NoParameter_StringWithFirstAndLast()
    {
        String[] date={"Mon 09/09/2019","Sun 15/09/2019"};
        assertEquals("Error in returnFirstAndLastDay(), Should return first and last day of week",date,dateOfWeek.returnFirstAndLastDay());
        assertArrayEquals("Error in returnFirstAndLastDay(), Should return first and last day of week",date,dateOfWeek.returnFirstAndLastDay());

    }

    @Test
    public void returnFirstAndLastDayTest_NoParameter_StringWithFirstAndLast_Failure()
    {
        String[] date={"Mon 09/08/2019","Sun 15/08/2019"};
        assertEquals("Error in returnFirstAndLastDay(), Should not return first and last day of week",date,dateOfWeek.returnFirstAndLastDay());
    }

}
