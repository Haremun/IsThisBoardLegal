package com.bieganski.board;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FieldCoordinatesTest {
    private FieldCoordinates fieldCoordinates;

    @BeforeClass
    void setUp() {
        fieldCoordinates = new FieldCoordinates(5, 6);
    }

    @Test
    void toString_ValueCanNotBe_Null() {
        Assert.assertNotNull(fieldCoordinates.toString());
    }

    @Test
    void getFieldCoordinates_getProperRowValue() {
        Assert.assertEquals(fieldCoordinates.getRow(), 5);
    }

    @Test
    void getFieldCoordinates_getProperColumnValue() {
        Assert.assertEquals(fieldCoordinates.getColumn(), 6);
    }

    @Test
    void getFieldCoordinates_getWrongRowValue() {
        Assert.assertNotEquals(fieldCoordinates.getRow(), 0);
    }

    @Test
    void getFieldCoordinates_getWrongColumnValue() {
        Assert.assertNotEquals(fieldCoordinates.getColumn(), 0);
    }

    @Test
    void setRowValue_setProperColumnValue() {
        fieldCoordinates = new FieldCoordinates(2, 3); //To think, can't be before testing getters
        fieldCoordinates.setColumn(4);
        Assert.assertEquals(fieldCoordinates.getColumn(), 4);
    }

    @Test
    void setRowValue_setProperRowValue() {
        fieldCoordinates = new FieldCoordinates(2, 3);
        fieldCoordinates.setRow(7);
        Assert.assertEquals(fieldCoordinates.getRow(), 7);
    }
}
