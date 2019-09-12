package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GenerateExceptionTest {

    private static GenerateException generateException;

    @BeforeClass
    public static void setup() {

        generateException= new GenerateException();

    }

    @AfterClass
    public static void teardown() {

        generateException= null;

    }

    @Test(expected = NegativeArraySizeException.class)
    public void  checkNagativeArrayIndexException_NoParameter_CatchString ()
    {
        generateException.checkNagativeArrayIndexException();
    }



    @Test(expected = IndexOutOfBoundsException.class)
    public void  checkIndexOutOfBoundException_NoParameter_CatchString_Finally ()
    {
        generateException.checkIndexOutOfBoundException();
    }


    @Test(expected =NullPointerException.class)
    public void  checkNullPointerException_NoParameter_CatchString_Finally ()
    {
        generateException.checkNullPointerException();
    }


}
