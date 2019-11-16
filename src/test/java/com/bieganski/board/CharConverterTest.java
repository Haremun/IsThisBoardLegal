package com.bieganski.board;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CharConverterTest {
    @BeforeClass
    public void setUp() {
        System.out.println("Testing CharConverter");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void convertCharNumberToInt_FailWhenArgumentIsNotNumber() {
        CharConverter.convertCharNumberToInt('k');
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void getIndexOfLetterInAlphabet_FailWhenArgumentIsNotLetter() {
        CharConverter.getIndexOfLetterInAlphabet('6');
    }
}
