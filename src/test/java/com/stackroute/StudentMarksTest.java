package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class StudentMarksTest {
    public static StudentMarks studentMarks;


    @BeforeClass
    public static void setup() {

        studentMarks = new StudentMarks();

    }

    @AfterClass
    public static void teardown() {

        studentMarks = null;

    }

    @Test
    public void checkGradeTest_ArrayOfStudentsGrade()
    {
        int[] arr1={120,30,70,90};
        assertEquals("Failed: Check in  checkGrade() ","Error in grade",studentMarks.checkGrade(4,arr1));


        int[] arr3={65,37,70,99,64};
        assertEquals("Failed: Check in  checkGrade() ","Success",studentMarks.checkGrade(5,arr3));

        int[] arr4=new int[4];
        assertNull("Failed: Array is null and checkGrade() not returning null",studentMarks.checkGrade(5,arr4));


    }
    @Test
    public void checkGradeTestFailure()
    {
        int[] arr1={76,30,70,90};
        assertNotEquals("Failed: Should return success","Error in grade",studentMarks.checkGrade(4,arr1));

        int[] arr2={90,-33,67,39,144,65};
        assertNotNull("Failed:should not return null ",studentMarks.checkGrade(6,arr2));

    }

}
