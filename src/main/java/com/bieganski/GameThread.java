package com.bieganski;

import com.bieganski.board.Board;
import com.bieganski.listeners.BoardCheckingListener;
import com.bieganski.listeners.BoardLoadListener;
import com.bieganski.listeners.UserAnswerListener;

public class GameThread extends Thread implements BoardCheckingListener, BoardLoadListener, UserAnswerListener {

    private boolean answer;
    private long computerTime;

    private static final String FILE_PATH = "/board.txt";

    @Override
    public void run() {
        System.out.println("New game: ");
        answer = false;

        BoardLoadThread boardLoadThread = new BoardLoadThread(this, FILE_PATH);
        boardLoadThread.start();
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

        UserAnswerThread userAnswerThread = new UserAnswerThread(this);
        userAnswerThread.start();

        System.out.println(board);
        System.out.println("Is this board legal? (Y/N)");
    }

    @Override
    public void onUserAnswer(boolean userAnswer, long time) {
        if (userAnswer)
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
        System.out.println("Your time: " + time + " sec");
        System.out.println("Computer time: " + computerTime + " ms");
    }
}
