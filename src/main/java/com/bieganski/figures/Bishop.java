package com.bieganski.figures;

import com.bieganski.board.FieldCoordinates;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Figure {
    public Bishop(){
        setFigureSymbol("B");
    }
    @Override
    public List<FieldCoordinates> checkCollision() {
        List<FieldCoordinates> coordinates= new ArrayList<>();

        return coordinates;
    }
}
