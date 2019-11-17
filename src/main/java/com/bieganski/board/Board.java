package com.bieganski.board;

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

    public void checkAttacks() {
        for (Figure figure :
                figures) {
            for (FieldCoordinates coordinates :
                    figure.checkCollision()) {
                board[coordinates.getRow()][coordinates.getColumn()].addFigureThatCanAttackThisField(figure);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Current player: ");
        builder.append(currentColor.toString());
        builder.append('\n');
        for (Field[] row : board) {
            for (Field field : row) {
                if (field != null) {
                    builder.append(field);
                }
            }
            builder.append('\n');
        }

        return builder.toString();
    }
}
