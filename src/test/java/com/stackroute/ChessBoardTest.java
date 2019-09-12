package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    private static ChessBoard chessBoard;


    @BeforeClass
    public static void setup() {

        chessBoard= new ChessBoard();

    }

    @AfterClass
    public static void teardown() {

        chessBoard = null;

    }

    @Test
    public void  createChessBoardTest_NoParameter_ArrayOfString ()
    {
        String[] chess=new String[8];
        String even="WW|BB|WW|BB|WW|BB|WW|BB";
        String odd="BB|WW|BB|WW|BB|WW|BB|WW";
        for(int i=0;i<8;i++)
        {
            if(i%2==0)
            {
                chess[i]=even;
            }
            else
            {
                chess[i]=odd;
            }
        }

        assertEquals("Failed: error in createChessBoard()",chess,chessBoard.createChessBoard());

        assertArrayEquals("Failed: error in createChessBoard()",chess,chessBoard.createChessBoard());

    }

    @Test
    public void  createChessBoardTest_NoParameter_ArrayOfStringFailure ()
    {
        String[] chess={"WW|BB|WW|BB|WW|BB|WW|BB",
                        "BB|WW|BB|WW|BB|WW|BB|WW",
                        "WW|BB|WW|BB|WW|BB|WW|BB",
                        "BB|WW|BB|WW|BB|WW|BB|WW",
                        "WW|BB|WW|BB|WW|BB|WW|BB",
                        "BB|WW|BB|WW|BB|WW|BB|WW",
                        "WW|BB|WW|BB|WW|BB|WW|BB",
                        "BB|WW|BB|WW|BB|WW|BB|WW"};



        assertNotEquals("Failed: error in createChessBoard(), Chess Board should start with WW ",chess,chessBoard.createChessBoard());

        assertNotNull("Failed: error in createChessBoard(), Chess Board should not be null",chessBoard.createChessBoard());
    }
}
