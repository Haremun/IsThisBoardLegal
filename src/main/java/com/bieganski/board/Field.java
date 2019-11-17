package com.bieganski.board;

import com.bieganski.figures.Figure;

class Field {
    private Figure figureOnThisField;
    private Figure figureThatCanAttackThisField;

    Figure getFigureOnThisField() {
        return figureOnThisField;
    }

    void setFigureOnThisField(Figure figureOnThisField) {
        this.figureOnThisField = figureOnThisField;
    }

    Figure getFigureThatCanAttackThisField() {
        return figureThatCanAttackThisField;
    }

    void setFigureThatCanAttackThisField(Figure figureThatCanAttackThisField) {
        this.figureThatCanAttackThisField = figureThatCanAttackThisField;
    }

    @Override
    public String toString() {
        if (figureOnThisField == null)
            return "__ ";
        else
            return figureOnThisField.getFigureSymbolWithColor() + " ";
    }
}
