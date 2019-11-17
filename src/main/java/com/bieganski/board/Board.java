package com.bieganski.board;

import com.bieganski.figures.Figure;

import java.util.List;
import java.util.Map;

public class Board {
    private Map<FieldCoordinates, Field> myFields;

    private Field[][] fields;
    private List<Figure> figures;
    private ColorFigure currentColor;

    Board(List<Figure> figures, ColorFigure currentColor) {
        if (figures == null)
            throw new IllegalArgumentException("List of figures can't be null");
        if (currentColor == null)
            throw new IllegalArgumentException("You have to declare current color");
        fields = new Field[8][8];
        this.figures = figures;
        this.currentColor = currentColor;

        for (Field[] row :
                fields) {
            for (int i = 0; i < row.length; i++)
                row[i] = new Field();
        }
        for (Figure figure :
                figures) {
            fields[figure.getRow()][figure.getColumn()].setFigureOnThisField(figure);
        }
    }

    public Field[][] getFields() {
        return fields;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public ColorFigure getCurrentColor() {
        return currentColor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Field[] row : fields) {
            for (Field field : row) {
                if (field != null) {
                    builder.append(field);
                }
            }
            builder.append('\n');
        }
        builder.append("Current player: ");
        builder.append(currentColor.toString());
        builder.append('\n');

        return builder.toString();
    }

}