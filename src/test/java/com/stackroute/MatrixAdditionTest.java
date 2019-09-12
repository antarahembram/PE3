package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    public static MatrixAddition matrixAddition;


    @BeforeClass
    public static void setup() {

        matrixAddition = new MatrixAddition();

    }

    @AfterClass
    public static void teardown() {

        matrixAddition = null;

    }

    @Test
    public void getAdditionTest_MatrixsGiven_AddtionOfTwoMatrix()
    {
        int noOfRows1=2;
        int noOfCol1=3;
        int[] m11={1,2,3,4,5,6};
        int[] m12={9,8,7,6,5,4};
        int[][] ans1={{10,10,10},{10,10,10}};
        assertEquals("addition() returns wrong value",ans1,matrixAddition.addition(noOfRows1,noOfCol1,m11,m12));

        int noOfRows=3;
        int noOfCol=3;
        int[] m1={12,23,13,41,25,26,35,21,98};
        int[] m2={18,17,7,6,5,4,5,9,2};
        int[][] ans2={{30,40,20},{47,30,30},{40,30,100}};
        assertEquals("addition() returns wrong value",ans1,matrixAddition.addition(noOfRows,noOfCol,m1,m2));



    }

    @Test
    public void getAdditionTest_MatrixsGiven_AddtionOfTwoMatrixFailure()
    {
        int noOfRows1=2;
        int noOfCol1=3;
        int[] m11={1,2,3,4,5,6};
        int[] m12={9,8,17,6,15,4};
        int[][] ans1={{10,10,10},{10,10,10}};
        assertNotEquals("addition() returns wrong value",ans1,matrixAddition.addition(noOfRows1,noOfCol1,m11,m12));


    }

}
