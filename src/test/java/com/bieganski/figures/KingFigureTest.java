package com.bieganski.figures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KingFigureTest {
    @Test
    void checkCollision_CanNotReturnNull(){
        KingFigure kingFigure = new KingFigure();
        Assert.assertNotNull(kingFigure.checkCollision());
    }
}
