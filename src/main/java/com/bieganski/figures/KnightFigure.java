package com.bieganski.figures;

import com.bieganski.board.Field;
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
        return coordinates;
    }
}
