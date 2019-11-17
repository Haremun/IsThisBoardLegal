package com.bieganski.figures;

import com.bieganski.board.FieldCoordinates;

import java.util.ArrayList;
import java.util.List;

public class RookFigure extends Figure {
    public RookFigure() {
        setFigureSymbol("R");
    }
    @Override
    public List<FieldCoordinates> checkCollision() {
        List<FieldCoordinates> coordinates = new ArrayList<>();
        for (int i = 0; i < 8; i++){
            coordinates.add(new FieldCoordinates(i, getColumn()));
            coordinates.add(new FieldCoordinates(getRow(), i));
        }
        return coordinates;
    }
}
