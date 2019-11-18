package com.bieganski.main_classes;

import com.bieganski.board.Board;

public class GameThread extends Thread implements BoardCheckingListener, BoardLoadListener, UserAnswerListener {

    private long computerTime;
    private Answer answer;
    private Times times;

    private static final String FILE_PATH = "/board.txt";

    @Override
    public void run() {
        System.out.println("New game: ");
        answer = new Answer();
        times = new Times();

        BoardLoadThread boardLoadThread = new BoardLoadThread(this, FILE_PATH);
        boardLoadThread.start();
    }

    @Override
    public void onBoardChecked(boolean legal, long time) {
        times.setComputerTime(time);
        if (answer.isAnswered()) {
            answer.setComputerAnswer(legal);
            System.out.println(answer.toString());
            System.out.println(times.toString());
        } else
            answer.setComputerAnswer(legal);

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
        times.setUserTime(time);
        if (answer.isAnswered()) {
            answer.setUserAnswer(userAnswer);
            System.out.println(answer.toString());
            System.out.println(times.toString());
        } else
            answer.setUserAnswer(userAnswer);

    }
}
