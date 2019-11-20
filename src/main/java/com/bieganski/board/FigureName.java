package com.bieganski.board;

import com.bieganski.figures.*;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

enum FigureName {
    K(KingFigure::new),
    N(KnightFigure::new),
    R(RookFigure::new),
    B(BishopFigure::new);

    final Supplier<Figure> factory;
    private FigureName(Supplier<Figure> factory) {
        this.factory = requireNonNull(factory);
    }
}
