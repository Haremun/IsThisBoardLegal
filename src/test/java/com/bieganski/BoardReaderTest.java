package com.bieganski;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardReaderTest {
    private BoardReader boardReader;

    @BeforeClass
    public void setUp() {
        System.out.println("Testing board reader");
        boardReader = new BoardReader();
    }

    @Test(expectedExceptions = {IllegalArgumentException.class, NullPointerException.class})
    public void readFileToList_FailToLoadUnexistingFile() {
        boardReader.readFileToList(null);
        boardReader.readFileToList("abc");
    }
    @Test
    public void readFileToList_LoadProperFile(){
        boardReader.readFileToList("board.txt");
    }

}
