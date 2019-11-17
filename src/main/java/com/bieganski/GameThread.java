package com.bieganski;

import com.bieganski.board.Board;
import com.bieganski.listeners.BoardCheckingListener;
import com.bieganski.listeners.BoardLoadListener;

import java.util.Scanner;

public class GameThread extends Thread implements BoardCheckingListener, BoardLoadListener {

    private boolean answer;
    private long computerTime;

    @Override
    public void run() {
        System.out.println("New game: ");
        answer = false;

        BoardLoadThread boardLoadThread = new BoardLoadThread(this, "board.txt");
        boardLoadThread.start();

        Scanner in = new Scanner(System.in);
        System.out.println("Is this board legal? (Y/N)");

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.startMeasure();
        String userInput = in.nextLine();
        stopwatch.stopMeasure();

        if (userInput.equals("Y"))
            if (answer)
                System.out.println("You are right, board is legal");
            else
                System.out.println("Wrong, board is illegal");
        else {
            if (answer)
                System.out.println("You are wrong, board is legal");
            else
                System.out.println("You are right, board is illegal");
        }
        System.out.println("Your time: " + stopwatch);
        System.out.println("Computer time: " + computerTime + " ms");
    }

    @Override
    public void onBoardChecked(boolean legal, long time) {
        answer = legal;
        computerTime = time;
    }

    @Override
    public void onBoardLoaded(Board board) {
        BoardCheckingThread boardCheckingThread = new BoardCheckingThread(board, this);
        boardCheckingThread.start();
        System.out.println(board);
    }
}
