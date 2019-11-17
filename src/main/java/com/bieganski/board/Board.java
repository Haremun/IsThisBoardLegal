package com.bieganski.board;

import com.bieganski.enums.ColorFigure;
import com.bieganski.figures.Figure;

import java.util.Arrays;
import java.util.List;

public class Board {
    private Figure[][] board;
    private ColorFigure currentColor;

    Board(List<Figure> figures, ColorFigure currentColor) {
        board = new Figure[8][8];
        for (Figure[] row :
                board) {
            Arrays.fill(row, null);
        }
        for (Figure figure :
                figures) {
            board[figure.getRow()][figure.getColumn()] = figure;
        }

        this.currentColor = currentColor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Current player: ");
        builder.append(currentColor.toString());
        builder.append('\n');
        for (Figure[] row : board) {
            for (Figure figure : row) {
                if (figure != null) {
                    builder.append(figure.getFigureSymbolWithColor());
                    builder.append(" ");
                } else
                    builder.append("__ ");
            }
            builder.append('\n');
        }
        return builder.toString();
    }
}
