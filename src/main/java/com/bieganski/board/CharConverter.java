package com.bieganski.board;

class CharConverter {
    static int getIndexOfLetterInAlphabet(char letter) {
        if (Character.isLetter(letter))
            return letter - 64; //ASCII
        else
            throw new IllegalArgumentException("Argument isn't letter!");

    }

    static int convertCharNumberToInt(char number) {
        //return number - 48; //ASCII
        if (Character.isDigit(number))
            return Character.getNumericValue(number);
        else
            throw new IllegalArgumentException("Argument isn't number");
    }
}
