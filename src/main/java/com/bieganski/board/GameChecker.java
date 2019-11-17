package com.bieganski.board;

import com.bieganski.IllegalMoves;
import com.bieganski.figures.Figure;

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
                board.getFields()[coordinates.getRow()][coordinates.getColumn()].addFigureThatCanAttackThisField(figure);
            }
        }
    }
    public boolean isKingLegal(){
        IllegalMoves illegalMoves = new IllegalMoves();
        for (Field[] row :
                board.getFields()) {
            for (Field field : row)
                if (field.canBeAttacked())
                    if (illegalMoves.isKingUnderAttackInOpponentsTurn(field.getFigureOnThisField(), board.getCurrentColor()))
                        return false;
        }
        return true;
    }
}
