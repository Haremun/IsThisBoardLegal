package com.bieganski.board;

import com.bieganski.board.BoardParser;
import com.bieganski.board.BoardReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardParserTest {
    private BoardParser boardParser;
    private BoardReader boardReader;

    @BeforeClass
    public void setUp(){
        System.out.println("Board parser test");
        boardReader = new BoardReader();
    }

    @Test(expectedExceptions = {NullPointerException.class})
    public void parse_ThrowsExceptionWhenNull(){
        boardParser = new BoardParser(null);
        boardParser.parse();
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void parse_WrongLettersInFile(){
        boardParser = new BoardParser(boardReader.readFileToList("bad_board.txt"));
        boardParser.parse();
    }
}
