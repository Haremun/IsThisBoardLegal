package com.bieganski.board;

public class FieldCoordinates {
    private int row;
    private int column;

    public FieldCoordinates(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "FieldCoordinates{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
