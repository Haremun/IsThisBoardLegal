package com.bieganski.board;

import com.bieganski.figures.Figure;
import com.bieganski.figures.KingFigure;
import com.bieganski.figures.KnightFigure;
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
            char color = line.charAt(0);
            if (color == '>')
                if (line.charAt(1) == 'B')
                    currentColor = ColorFigure.Black;
                else
                    currentColor = ColorFigure.White;
            else {
                Figure figure;
                switch (line.charAt(1)) {
                    case 'K':
                        figure = new KingFigure();
                        break;
                    case 'N':
                        figure = new KnightFigure();
                        break;
                    default:
                        figure = null;
                        break;
                }
                if (figure == null)
                    throw new IllegalArgumentException("There is no figure like " + line.charAt(1));

                figure.setColumn(getIndexOfLetterInAlphabet(line.charAt(3)));
                figure.setRow(convertCharToInt(line.charAt(4)));
                figures.add(figure);
            }
            System.out.println(color);
        }
    }

    public Board getBoard() {
        return new Board(figures);
    }

    private int getIndexOfLetterInAlphabet(char letter) {
        return letter - 64; //ASCII
    }
    private int convertCharToInt(char number){
        return number - 48; //ASCII
    }
}
