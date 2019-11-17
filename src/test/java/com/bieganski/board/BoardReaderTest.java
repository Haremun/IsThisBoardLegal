package com.bieganski.board;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardReaderTest {
    private BoardReader boardReader;

    @BeforeClass
    void setUp() {
        boardReader = new BoardReader();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void readFileToList_ThrowsExceptionWhenFileNameIsBad() {
        boardReader.readFileToList("abc");
    }

    @Test(expectedExceptions = NullPointerException.class)
    void readFileToList_ThrowsExceptionWhenArgumentIsNull() {
        boardReader.readFileToList(null);
    }

    @Test
    void readFileToList_LoadProperFile() {
        Assert.assertFalse(boardReader.readFileToList("/board.txt").isEmpty());
    }
    @Test
    void redFileToList_ShouldNotBeNull(){
        Assert.assertNotNull(boardReader.readFileToList("/board.txt"));
    }

}
