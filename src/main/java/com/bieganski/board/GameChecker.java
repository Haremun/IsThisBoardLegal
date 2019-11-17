package com.bieganski.board;

import com.bieganski.IllegalMoves;
import com.bieganski.board.Board;
import com.bieganski.board.Field;
import com.bieganski.figures.Figure;

import java.util.List;

public class GameChecker {
    private Board board;

    public GameChecker(Board board) {
        this.board = board;
    }
    public void checkAttacks() {
        for (Figure figure :
                board.getFigures()) {
            for (FieldCoordinates coordinates :
                    figure.checkCollision()) {
                board.getBoard()[coordinates.getRow()][coordinates.getColumn()].addFigureThatCanAttackThisField(figure);
            }
        }
    }
    public boolean isKingLegal(){
        IllegalMoves illegalMoves = new IllegalMoves();
        for (Field[] row :
                board.getBoard()) {
            for (Field field : row)
                if (field.canBeAttacked())
                    if (illegalMoves.isKingUnderAttackInOpponentsTurn(field.getFigureOnThisField(), board.getCurrentColor()))
                        return false;
        }
        return true;
    }
}
