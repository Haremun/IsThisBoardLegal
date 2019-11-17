package com.bieganski.main_threads;

import com.bieganski.board.Board;
import com.bieganski.board.GameChecker;

public class BoardCheckingThread extends Thread {
    private Stopwatch stopwatch;
    private Board board;
    private BoardCheckingListener listener;
    private boolean result;

    public BoardCheckingThread(Board board, BoardCheckingListener listener){
        stopwatch= new Stopwatch();
        this.board = board;
        this.listener = listener;
        result = true;
    }
    @Override
    public void run() {
        stopwatch.startMeasure();
        GameChecker gameChecker = new GameChecker(board);
        gameChecker.checkAttacks();
        if (!gameChecker.isKingLegal())
            result = false;
        stopwatch.stopMeasure();
        listener.onBoardChecked(result, stopwatch.getTimeInMili());
    }
}
