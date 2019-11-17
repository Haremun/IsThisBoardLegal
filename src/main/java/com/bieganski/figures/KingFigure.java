package com.bieganski.figures;

import com.bieganski.board.Field;
import com.bieganski.board.FieldCoordinates;

import java.util.ArrayList;
import java.util.List;

public class KingFigure extends Figure {
    public KingFigure() {
        setFigureSymbol("K");
    }

    @Override
    public List<FieldCoordinates> checkCollision() {
        List<FieldCoordinates> coordinates = new ArrayList<>();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (!(getColumn() == getColumn() + j && getRow() == getRow() + i))
                    coordinates.add(new FieldCoordinates(getRow() + i, getColumn() + j));
            }
        }
        return coordinates;
    }


}

