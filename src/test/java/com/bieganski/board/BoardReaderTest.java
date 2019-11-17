package com.bieganski.board;

import com.bieganski.board.BoardReader;
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
        boardReader.readFileToList("board.txt");
    }

}
