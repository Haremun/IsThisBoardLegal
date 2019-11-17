package com.bieganski.figures;

import com.bieganski.board.FieldCoordinates;
import com.bieganski.enums.ColorFigure;

import java.util.List;

public abstract class Figure {
    private char colorFigureChar;
    private ColorFigure colorFigure;
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

    void setFigureSymbol(String figureSymbol) {
        this.figureSymbol = figureSymbol;
    }

    public String getFigureSymbolWithColor() {
        return colorFigureChar + figureSymbol;
    }

    public String getFigureSymbol() {
        return figureSymbol;
    }

    public ColorFigure getColorFigure() {
        return colorFigure;
    }

    public void setColorFigureChar(char colorFigureChar) {
        this.colorFigureChar = colorFigureChar;
        if (colorFigureChar == 'B')
            colorFigure = ColorFigure.Black;
        else
            colorFigure = ColorFigure.White;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "colorFigure=" + colorFigureChar +
                " colorFigureEnum=" + colorFigure +
                ", figureSymbol='" + figureSymbol + '\'' +
                ", column=" + column +
                ", row=" + row +
                '}';
    }
}
