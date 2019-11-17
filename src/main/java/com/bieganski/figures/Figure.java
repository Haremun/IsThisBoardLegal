package com.bieganski.figures;

import com.bieganski.board.Field;
import com.bieganski.board.FieldCoordinates;
import com.bieganski.enums.ColorFigure;

import java.util.List;
import java.util.Objects;

public abstract class Figure {
    private char colorFigure;
    private String figureSymbol;
    private int column;
    private int row;

    public abstract List<FieldCoordinates> checkCollision();

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    protected void setFigureSymbol(String figureSymbol) {
        this.figureSymbol = figureSymbol;
    }

    public String getFigureSymbolWithColor() {
        return colorFigure + figureSymbol;
    }

    public void setColorFigure(char colorFigure) {
        this.colorFigure = colorFigure;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "colorFigure=" + colorFigure +
                ", figureSymbol='" + figureSymbol + '\'' +
                ", column=" + column +
                ", row=" + row +
                '}';
    }
}
