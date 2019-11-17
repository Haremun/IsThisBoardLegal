package com.bieganski.board;

import com.bieganski.enums.ColorFigure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    void getFields_ShouldThrowException(){
        Board board = new Board(null, ColorFigure.White);
    }
}
