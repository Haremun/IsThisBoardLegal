package com.bieganski;

import com.bieganski.board.BoardParser;
import com.bieganski.board.BoardReader;
import com.bieganski.listeners.BoardLoadListener;

public class BoardLoadThread extends Thread {
    private BoardLoadListener listener;
    private String fileName;

    public BoardLoadThread(BoardLoadListener listener, String fileName) {
        this.listener = listener;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        BoardReader boardReader = new BoardReader();

        BoardParser boardParser = new BoardParser(boardReader.readFileToList("board.txt"));
        boardParser.parse();
        listener.onBoardLoaded(boardParser.getBoard());
    }
}
