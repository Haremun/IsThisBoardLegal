package com.bieganski.main_classes;

import com.bieganski.board.Board;
import com.bieganski.board.BoardParser;
import com.bieganski.board.BoardReader;

class BoardLoadThread extends Thread {
    private BoardLoadListener listener;
    private String fileName;

    BoardLoadThread(BoardLoadListener listener, String fileName) {
        this.listener = listener;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        BoardReader boardReader = new BoardReader();

        BoardParser boardParser = new BoardParser(boardReader.readFileToList(fileName));
        boardParser.parse();
        Board board = boardParser.getBoard();
        if (board != null)
            listener.onBoardLoaded(board);
    }
}
