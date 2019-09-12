package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class UpperCaseFileContentTest {
    public static UpperCaseFileContent upperCaseFileContent;


    @BeforeClass
    public static void setup() {

        upperCaseFileContent = new UpperCaseFileContent();

    }

    @AfterClass
    public static void teardown() {

        upperCaseFileContent = null;

    }

    @Test
    public void getContentOfFileTest_FileName_StringOfContent() throws IOException {
        File file=new File("input.txt");
        OutputStream outputStream=new FileOutputStream(file);
        String content1="Hello World! Now Read the file and Check your output";
        outputStream.write(content1.getBytes());
        String filename1="input1.txt";
        assertEquals("Error in getContentOfFile():should return in UpperCase",content1.toUpperCase(),upperCaseFileContent.getContentOfFile(filename1));

        File file2=new File("input2.txt");
        OutputStream outputStream2=new FileOutputStream(file2);
        String content2="";
        outputStream.write(content1.getBytes());
       String filename2="input2.txt";
       assertNull("Error in getContentOfFile(): Should return null",upperCaseFileContent.getContentOfFile(filename2));
    }

    @Test
    public void getContentOfFileTest_FileName_StringOfContent_Failure() throws IOException {
        File file=new File("input3.txt");
        OutputStream outputStream=new FileOutputStream(file);
        String content1="Hello World! Now Read the file and Check your output";
        outputStream.write(content1.getBytes());
        String filename1="input3.txt";
        assertNotEquals("Error in getContentOfFile(): should not return In UpperCase",content1,upperCaseFileContent.getContentOfFile(filename1));


       assertNotNull("Error in getContentOfFile(): Should not return null",upperCaseFileContent.getContentOfFile(filename1));
    }



}
