package com.bieganski;

import com.bieganski.board.Board;
import com.bieganski.board.BoardParser;
import com.bieganski.board.BoardReader;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BoardReader boardReader = new BoardReader();

        BoardParser boardParser = new BoardParser(boardReader.readFileToList("board.txt"));
        boardParser.parse();
        Board board = boardParser.getBoard();
        board.checkAttacks();
        System.out.println(board);

        Scanner in = new Scanner(System.in);
        System.out.println("Is this board legal? (Y/N)");
        String userInput = in.nextLine();

        if (userInput.equals("Y"))
            System.out.println(userInput);

    }
}
