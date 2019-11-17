package com.bieganski.board;

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
                if (!(coordinates.getRow() < 0 || coordinates.getRow() > 7) && !(coordinates.getColumn() < 0 || coordinates.getColumn() > 7)) {
                    Field field = board.getFields()[coordinates.getRow()][coordinates.getColumn()];
                    if (field.getFigureOnThisField() != null){
                        if (field.getFigureOnThisField().getColorFigure() != figure.getColorFigure())
                            field.addFigureThatCanAttackThisField(figure);
                    } else {
                        field.addFigureThatCanAttackThisField(figure);
                    }


                }

            }
        }
    }

    public boolean isKingLegal() {
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
