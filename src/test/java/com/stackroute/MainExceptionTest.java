package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainExceptionTest {
    private static MainException mainException;


    @BeforeClass
    public static void setup() {

        mainException= new MainException();

    }

    @AfterClass
    public static void teardown() {

        mainException= null;

    }

    @Test (expected = MyException.class)
    public void  checkMain_NoParameter_CatchOrFinally ()
    {
        mainException.checkMain();

    }


}


