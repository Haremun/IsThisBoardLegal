package com.bieganski.board;

import com.bieganski.enums.ColorFigure;
import com.bieganski.figures.Figure;
import com.bieganski.figures.KingFigure;

class IllegalMoves {
    boolean isKingUnderAttackInOpponentsTurn(Figure figure, ColorFigure colorFigure) {
        if (figure != null)
            if (figure.getFigureSymbol().equals("K")) {
                return figure.getColorFigure() != colorFigure;
            }
        return false;
    }
}
