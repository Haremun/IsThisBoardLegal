package com.bieganski.board;

import com.bieganski.figures.Figure;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private Figure figureOnThisField;
    private List<Figure> figuresThatCanAttackThisField;

    Field() {
        figuresThatCanAttackThisField = new ArrayList<>();
    }

    Figure getFigureOnThisField() {
        return figureOnThisField;
    }

    void setFigureOnThisField(Figure figureOnThisField) {
        this.figureOnThisField = figureOnThisField;
    }

    List<Figure> getFiguresThatCanAttackThisField() {
        return figuresThatCanAttackThisField;
    }

    boolean canBeAttacked(){
        return !figuresThatCanAttackThisField.isEmpty();
    }

    void addFigureThatCanAttackThisField(Figure figureThatCanAttackThisField) {
        this.figuresThatCanAttackThisField.add(figureThatCanAttackThisField);
    }

    @Override
    public String toString() {
        /*if (!figuresThatCanAttackThisField.isEmpty()) {
            if (figureOnThisField != null)
                return figureOnThisField.getFigureSymbolWithColor() + " ";
            else
                return String.format("%02d ", figuresThatCanAttackThisField.size());
        }*/
        if (figureOnThisField == null)
            return "__ ";
        else
            return figureOnThisField.getFigureSymbolWithColor() + " ";
    }
}
