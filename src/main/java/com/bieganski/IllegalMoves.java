package com.bieganski;

import com.bieganski.enums.ColorFigure;
import com.bieganski.figures.Figure;
import com.bieganski.figures.KingFigure;

public class IllegalMoves {
    public boolean isKingUnderAttackInOpponentsTurn(Figure figure, ColorFigure colorFigure) {
        if (figure != null)
            if (figure.getFigureSymbol().equals("K")) {
                return figure.getColorFigure() != colorFigure;
            }
        return false;
    }
}
