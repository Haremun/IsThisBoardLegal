package com.bieganski.board;

import com.bieganski.figures.*;

import java.util.ArrayList;
import java.util.List;

public class BoardParser {
    private List<String> lines;
    private List<Figure> figures;
    private ColorFigure currentColor;

    public BoardParser(List<String> lines) {
        this.lines = lines;
        this.figures = new ArrayList<>();
    }

    public void parse() {
        if (lines == null)
            throw new NullPointerException("List of text lines can't be null");
        for (String line :
                lines) {
            char color = line.charAt(0); //Checking color or turn symbol '>'
            if (color == '>')
                if (line.charAt(1) == 'B')
                    currentColor = ColorFigure.Black;
                else
                    currentColor = ColorFigure.White;
            else {
                if (color != 'W' && color != 'B')
                    throw new IllegalArgumentException("Color can be only W-White or B-Black");

                Figure figure = FigureName.valueOf(line.charAt(1) + "").factory.get();
                
                figure.setColorFigureChar(color); //Set figure color
                figure.setColumn(CharConverter.getIndexOfLetterInAlphabet(line.charAt(3)) - 1); //Set figure column
                figure.setRow(CharConverter.convertCharNumberToInt(line.charAt(4)) - 1); //Set figure row
                figures.add(figure);
            }
        }
    }

    public Board getBoard() {
        if (!lines.isEmpty())
            return new Board(figures, currentColor);
        else
            return null;
    }
}
