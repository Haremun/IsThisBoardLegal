package com.bieganski.figures;

import com.bieganski.enums.ColorFigure;

public abstract class Figure {
    private ColorFigure colorFigure;
    private String figureSymbol;
    private int column;
    private int row;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
        System.out.println(column);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
        System.out.println(row);
    }

    public void setFigureSymbol(String figureSymbol) {
        this.figureSymbol = figureSymbol;
    }

    public String getFigureSymbol() {
        return figureSymbol;
    }
}
