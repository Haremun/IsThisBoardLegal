package com.bieganski.figures;

import com.bieganski.board.FieldCoordinates;
import com.bieganski.figures.Figure;

import java.util.ArrayList;
import java.util.List;

public class BishopFigure extends Figure {
    public BishopFigure(){
        setFigureSymbol("B");
    }
    @Override
    public List<FieldCoordinates> checkCollision() {
        List<FieldCoordinates> coordinates= new ArrayList<>();

        return coordinates;
    }
}