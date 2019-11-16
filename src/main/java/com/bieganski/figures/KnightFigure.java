package com.bieganski.figures;

public class KnightFigure extends Figure {
    public KnightFigure(){
        setFigureSymbol("N");
    }

    @Override
    protected boolean checkCollision(Figure figure) {
        return false;
    }
}
