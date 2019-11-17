package com.bieganski.board;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BoardParserTest {
    private BoardParser boardParser;
    private List<String> textLinesWithWrongLetters;

    @BeforeClass
    void setUp() {
        textLinesWithWrongLetters = new ArrayList<>();
        textLinesWithWrongLetters.add("LK F6");
        textLinesWithWrongLetters.add("BL F4");
        textLinesWithWrongLetters.add("WN Q10");
        textLinesWithWrongLetters.add(">W");
    }

    @Test(expectedExceptions = {NullPointerException.class})
    void parse_ThrowsExceptionWhenNull() {
        boardParser = new BoardParser(null);
        boardParser.parse();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void parse_WrongLettersInFile() {
        boardParser = new BoardParser(textLinesWithWrongLetters);
        boardParser.parse();
    }
}
