package com.bieganski;

import com.bieganski.board.Board;
import com.bieganski.listeners.BoardCheckingListener;
import com.bieganski.listeners.BoardLoadListener;

import java.util.Scanner;

public class GameThread extends Thread implements BoardCheckingListener, BoardLoadListener {

    @Override
    public void run() {
        System.out.println("New game: ");

        BoardLoadThread boardLoadThread = new BoardLoadThread(this, "board.txt");
        boardLoadThread.start();

        Scanner in = new Scanner(System.in);
        System.out.println("Is this board legal? (Y/N)");

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.startMeasure();
        String userInput = in.nextLine();
        stopwatch.stopMeasure();
        System.out.println("Your time: " + stopwatch);


        //boardCheckingThread.start();
    }

    @Override
    public void onBoardChecked(boolean legal) {
        if (legal)
            System.out.println("Board is legal");
        else
            System.out.println("Board is illegal");
    }

    @Override
    public void onBoardLoaded(Board board) {
        BoardCheckingThread boardCheckingThread = new BoardCheckingThread(board, this);
        boardCheckingThread.start();
        System.out.println(board);
    }
}
