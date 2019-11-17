package com.bieganski.board;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FieldTest {

    @Test
    void getFiguresThatCanAttackThisField_CanNotReturnNull(){
        Field field = new Field();
        Assert.assertNotNull(field.getFiguresThatCanAttackThisField());
    }
    @Test
    void getFigureOnThisField_ShouldReturnNull(){
        Field field = new Field();
        Assert.assertNull(field.getFigureOnThisField());
    }
    @Test
    void toString_ValueCanNotBe_Null() {
        Field field = new Field();
        Assert.assertNotNull(field.toString());
    }
}
