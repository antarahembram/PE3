package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CountFrequencyTest {
    public static CountFrequency countFrequency;


    @BeforeClass
    public static void setup() {

        countFrequency = new CountFrequency();

    }

    @AfterClass
    public static void teardown() {

        countFrequency = null;

    }

    @Test
    public void countFrequencyInFile_FileName_ListOfStringWithFrequency() throws IOException {
        File file=new File("fileDemo.txt");
        OutputStream outputStream=new FileOutputStream(file);
        String content1="i am a man ,i like to sleep,\n i have a home.";
        outputStream.write(content1.getBytes());
        List<String> frequency1=new ArrayList<String>();
        frequency1.add("i-3");
        frequency1.add("am-1");
        frequency1.add("man-1");
        frequency1.add("like-1");
        frequency1.add("to-1");
        frequency1.add("sleep-1");
        frequency1.add("have-1");
        frequency1.add("am-1");
        frequency1.add("home-1");

        String filename1="fileDemo.txt";
        assertEquals("Error in countFrequencyInFile():should return in Frequency of words",frequency1,countFrequency.countFrequencyInFile(filename1));

        File file2=new File("fileDemo1.txt");
        OutputStream outputStream2=new FileOutputStream(file2);
        String content2="";
        outputStream.write(content1.getBytes());
        String filename2="fileDemo1.txt";
        assertNull("Error countFrequencyInFile(): should return null ",countFrequency.countFrequencyInFile(filename2));
    }

    @Test
    public void countFrequencyInFile_FileName_ListOfStringWithFrequency_Failure() throws IOException {
        List<String> frequency1=new ArrayList<String>();
        frequency1.add("i-3");
        frequency1.add("am-1");
        frequency1.add("man-1");
        frequency1.add("like-1");
        frequency1.add("to-1");
        frequency1.add("sleep-2");
        frequency1.add("have-1");
        frequency1.add("am-2");
        frequency1.add("home-1");
        String filename="fileDemo2.txt";
        assertNotEquals("Error in countFrequencyInFile():should not return in Frequency of words correctly",countFrequency.countFrequencyInFile(filename));

        assertNotNull("Error countFrequencyInFile(): should not return null ",countFrequency.countFrequencyInFile(filename));
    }

}
