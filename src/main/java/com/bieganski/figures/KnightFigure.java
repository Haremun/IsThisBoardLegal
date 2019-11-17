package com.bieganski.figures;

import com.bieganski.board.FieldCoordinates;

import java.util.ArrayList;
import java.util.List;

public class KnightFigure extends Figure {
    public KnightFigure() {
        setFigureSymbol("N");
    }

    @Override
    public List<FieldCoordinates> checkCollision() {
        List<FieldCoordinates> coordinates = new ArrayList<>();
        coordinates.add(new FieldCoordinates(getRow() - 2, getColumn() - 1)); //To think
        coordinates.add(new FieldCoordinates(getRow() - 2, getColumn() + 1));
        coordinates.add(new FieldCoordinates(getRow() + 2, getColumn() - 1));
        coordinates.add(new FieldCoordinates(getRow() + 2, getColumn() + 1));
        coordinates.add(new FieldCoordinates(getRow() - 1, getColumn() - 2));
        coordinates.add(new FieldCoordinates(getRow() - 1, getColumn() + 2));
        coordinates.add(new FieldCoordinates(getRow() + 1, getColumn() - 2));
        coordinates.add(new FieldCoordinates(getRow() + 1, getColumn() + 2));
        return coordinates;
    }
}
