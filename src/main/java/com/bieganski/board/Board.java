package com.bieganski.board;

import com.bieganski.figures.Figure;

import java.util.Arrays;
import java.util.List;

public class Board {
    private Figure[][] board;

    Board(List<Figure> figures){
        board = new Figure[8][8];
        for (Figure[] row :
                board) {
            Arrays.fill(row, null);
        }
        for (Figure figure :
                figures) {
            board[figure.getRow()][figure.getColumn()] = figure;
        }
    }

    public void showBoard() {
        for (Figure[] row : board) {
            for (Figure figure : row) {
                if (figure != null)
                System.out.print(figure.getFigureSymbol() + " ");
                else
                    System.out.print("__ ");
            }
            System.out.println();
        }
    }
}
