package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    private static ConsecutiveNumber consecutiveNumber;


    @BeforeClass
    public static void setup() {

        consecutiveNumber= new ConsecutiveNumber();

    }

    @AfterClass
    public static void teardown() {

        consecutiveNumber = null;

    }

    @Test
    public void  checkConsecutiveTest_StringContainsNumbers_ConsetiveOrNot ()
    {
       String numbers1="56,54,53,52,51";
        assertTrue("Failed: error in checkConsecutiveNumber()",consecutiveNumber.checkConsecutiveNumber(numbers1));

       // String[] placesName2={};
        //assertNull("Failed: getremoveVowels() should return null",removeVowels.getRemoveVowels(placesName2));
    }

    @Test
    public void  checkConsecutiveTest_StringContainsNumbers_ConsetiveOrNot_Failure ()
    {
        String numbers1="56,54,53,50,51";
        assertFalse("Failed: error in checkConsecutiveNumber()",consecutiveNumber.checkConsecutiveNumber(numbers1));

        // String[] placesName2={};
        //assertNull("Failed: getremoveVowels() should return null",removeVowels.getRemoveVowels(placesName2));
    }
}
