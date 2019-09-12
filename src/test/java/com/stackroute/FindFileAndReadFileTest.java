package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindFileAndReadFileTest {
    public static FindFileAndReadFile findFileAndReadFile;


    @BeforeClass
    public static void setup() {

        findFileAndReadFile = new FindFileAndReadFile();

    }

    @AfterClass
    public static void teardown() {

       findFileAndReadFile = null;

    }

    @Test
    public void getFilesAndReadTest_PathOfDirectory_ListOfContentsAndPrintContent() throws IOException {
        File dir=new File("dir");
        dir.mkdir();
        File file1=new File("dir//file1.txt");
        OutputStream outputStream=new FileOutputStream(file1);
        String content1="Hello! This is File1";
        outputStream.write(content1.getBytes());
        File file2=new File("dir//file2.csv");
        OutputStream outputStream2=new FileOutputStream(file2);
        String content2="Hello! This is File2";
        outputStream.write(content1.getBytes());
        File file3=new File("dir//file3.exe");
        OutputStream outputStream3=new FileOutputStream(file3);

        File file4=new File("dir//file4.txt");
        OutputStream outputStream4=new FileOutputStream(file4);
        String content4="Hello! This is File4";
        outputStream.write(content1.getBytes());

        List<String> fileNamesAndContent=new ArrayList<String>();
        fileNamesAndContent.add("file1.txt file2.csv file3.exe file4.txt");
        fileNamesAndContent.add("file1.txt Hello! This is File1");
        fileNamesAndContent.add("file4.txt Hello! This is File4");

        String directoryPath = "dir";
        String extentionType=".txt";
        assertEquals("Error in the getFilesAndRead(),",fileNamesAndContent,findFileAndReadFile.getFilesAndRead(directoryPath,extentionType));


        File dir1=new File("dir1");
        dir1.mkdir();

        assertNull("Error in the getFilesAndRead(),There is no file",findFileAndReadFile.getFilesAndRead("dir1",".txt"));
    }
    @Test
    public void getFilesAndReadTest_PathOfDirectory_ListOfContentsAndPrintContent_Failure() throws IOException {


        List<String> fileNamesAndContent=new ArrayList<String>();
        fileNamesAndContent.add("file1.txt file2.csv file3.exe file4.txt");
        fileNamesAndContent.add("file1.txt Hello! This is File1");
        fileNamesAndContent.add("file2.txt Hello! This is File2");
        fileNamesAndContent.add("file4.txt Hello! This is File4");

        String directoryPath = "dir";
        String extentionType=".txt";
        assertNotEquals("Error in the getFilesAndRead(),",fileNamesAndContent,findFileAndReadFile.getFilesAndRead(directoryPath,extentionType));

        assertNotNull("Error in the getFilesAndRead(),should not return null",findFileAndReadFile.getFilesAndRead(directoryPath,extentionType));

    }
}


