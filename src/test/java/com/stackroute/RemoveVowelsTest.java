package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

        private static RemoveVowels removeVowels;


        @BeforeClass
        public static void setup() {

            removeVowels= new RemoveVowels();

        }

        @AfterClass
        public static void teardown() {

            removeVowels = null;

        }

        @Test
        public void  removeVowelsTest_ArrayOfPlaces_VowelRemovedArray ()
        {
            String[] placesName1={"India", "United States", "Germany", "Egypt","Czechoslovakia"};
            String[] placesNameRemovedVowels1={"Ind","Untd Stts","Grmny","Egypt","Czchslvka"};
            assertEquals("Failed: error in getremoveVowels()",placesNameRemovedVowels1,removeVowels.getRemoveVowels(placesName1));

            String[] placesName2={};
            assertNull("Failed: getremoveVowels() should return null",removeVowels.getRemoveVowels(placesName2));
        }

    @Test
    public void  removeVowelsTest_ArrayOfPlaces_VowelRemovedArrayFailure ()
    {
        String[] placesName1={"India", "United States", "Germany", "Egypt","Czechoslovakia"};
        String[] placesNameRemovedVowels1={"nd","ntd Stts","rmny","gypt","zchslvka"};
        assertNotEquals("Failed: error in getremoveVowels(), In output the first letter should br there",placesNameRemovedVowels1,removeVowels.getRemoveVowels(placesName1));

        assertNotNull("Failed:  getremoveVowels() should not return null",removeVowels.getRemoveVowels(placesName1));

    }

}

