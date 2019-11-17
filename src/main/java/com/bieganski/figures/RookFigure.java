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
        return null;
    }
}
