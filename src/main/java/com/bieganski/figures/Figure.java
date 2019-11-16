package com.bieganski.figures;

import com.bieganski.enums.ColorFigure;

public abstract class Figure {
    private char colorFigure;
    private String figureSymbol;
    private int column;
    private int row;

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

    public String getFigureSymbol() {
        return colorFigure + figureSymbol;
    }

    public void setColorFigure(char colorFigure) {
        this.colorFigure = colorFigure;
    }
}
