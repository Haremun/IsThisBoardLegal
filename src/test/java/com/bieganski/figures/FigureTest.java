package com.bieganski.figures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FigureTest {

    @Test
    void toString_CanNotReturnNull(){
        Figure figure = new KingFigure(); //To think, testing abstract class
        Assert.assertNotNull(figure);
    }
}
