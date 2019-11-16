package com.bieganski;

import com.bieganski.board.Board;
import com.bieganski.board.BoardParser;
import com.bieganski.board.BoardReader;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        BoardReader boardReader = new BoardReader();
        List<String> lines = boardReader.readFileToList("board.txt");

        BoardParser boardParser = new BoardParser(lines);
        boardParser.parse();
        Board board = boardParser.getBoard();
        board.showBoard();

    }
}
