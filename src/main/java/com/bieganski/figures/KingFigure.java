package com.bieganski.figures;

public class KingFigure extends Figure {
    public KingFigure(){
        setFigureSymbol("K");
    }

    @Override
    protected boolean checkCollision(Figure figure) {
        return false;
    }
}
