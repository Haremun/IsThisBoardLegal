package com.bieganski.board;

import com.bieganski.figures.*;
import com.bieganski.enums.ColorFigure;

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
                Figure figure;
                switch (line.charAt(1)) { //Checking figure symbol
                    case 'K':
                        figure = new KingFigure();
                        break;
                    case 'N':
                        figure = new KnightFigure();
                        break;
                    case 'R':
                        figure= new RookFigure();
                        break;
                    case 'B':
                        figure= new Bishop();
                        break;
                    default:
                        throw new IllegalArgumentException("There is no figure like " + line.charAt(1));
                }
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
