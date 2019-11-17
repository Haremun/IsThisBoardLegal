package com.bieganski.figures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnightTest {
    @Test
    void checkCollision_CanNotReturnNull(){
        KnightFigure knightFigure = new KnightFigure();
        Assert.assertNotNull(knightFigure.checkCollision());
    }
}
