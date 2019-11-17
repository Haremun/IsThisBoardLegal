package com.bieganski.board;

import com.bieganski.IllegalMoves;
import com.bieganski.enums.ColorFigure;
import com.bieganski.figures.Figure;

import java.util.List;

public class Board {
    private Field[][] board;
    private List<Figure> figures;
    private ColorFigure currentColor;

    Board(List<Figure> figures, ColorFigure currentColor) {
        board = new Field[8][8];
        this.figures = figures;
        this.currentColor = currentColor;

        for (Field[] row :
                board) {
            for (int i = 0; i < row.length; i++)
                row[i] = new Field();
        }
        for (Figure figure :
                figures) {
            board[figure.getRow()][figure.getColumn()].setFigureOnThisField(figure);
        }
    }

    public Field[][] getBoard() {
        return board;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public ColorFigure getCurrentColor() {
        return currentColor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Field[] row : board) {
            for (Field field : row) {
                if (field != null) {
                    builder.append(field);
                }
            }
            builder.append('\n');
        }
        builder.append("Current player: ");
        builder.append(currentColor.toString());
        builder.append('\n');

        return builder.toString();
    }
}
