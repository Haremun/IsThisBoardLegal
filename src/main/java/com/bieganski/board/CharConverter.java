package com.bieganski.board;

public class CharConverter {
    static int getIndexOfLetterInAlphabet(char letter) {
        if (Character.isLetter(letter) || letter < 64)
            return letter - 64; //ASCII
        else
            throw new IllegalArgumentException("Argument isn't a letter!");

    }

    static int convertCharNumberToInt(char number) {
        //return number - 48; //ASCII
        System.out.println(Character.getNumericValue(number));
        return Character.getNumericValue(number);
    }
}
