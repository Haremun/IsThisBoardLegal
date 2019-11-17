package com.bieganski.board;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CharConverterTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    void convertCharNumberToInt_FailWhenArgumentIsNotNumber() {
        CharConverter.convertCharNumberToInt('k');
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void getIndexOfLetterInAlphabet_FailWhenArgumentIsNotLetter() {
        CharConverter.getIndexOfLetterInAlphabet('6');
    }
    @Test
    void convertCharNumberToInt_ProperValue(){
        Assert.assertEquals(CharConverter.convertCharNumberToInt('4'), 4);
    }
    @Test
    void convertCharNumberToInt_WrongValue(){
        Assert.assertNotEquals(CharConverter.convertCharNumberToInt('6'), 1);
        Assert.assertNotEquals(CharConverter.convertCharNumberToInt('4'), 0);
    }
    @Test
    void getIndexOfLetterInAlphabet_ProperValue(){
        Assert.assertEquals(CharConverter.getIndexOfLetterInAlphabet('C'), 3);
    }
    @Test
    void getIndexOfLetterInAlphabet_LowerCaseShouldWork(){
        Assert.assertEquals(CharConverter.getIndexOfLetterInAlphabet('a'), 1);
    }
    @Test
    void getIndexOfLetterInAlphabet_WrongValue(){
        Assert.assertNotEquals(CharConverter.getIndexOfLetterInAlphabet('C'), 0);
    }
}
