package com.bieganski.main_classes;

import com.bieganski.board.Board;

public class GameThread extends Thread implements BoardCheckingListener, BoardLoadListener, UserAnswerListener {

    private long computerTime;
    private Answer answer;

    private static final String FILE_PATH = "/board.txt";

    @Override
    public void run() {
        System.out.println("New game: ");
        answer = new Answer();

        BoardLoadThread boardLoadThread = new BoardLoadThread(this, FILE_PATH);
        boardLoadThread.start();
    }

    @Override
    public void onBoardChecked(boolean legal, long time) {
        answer.setComputerAnswer(legal);
        if (answer.isAnswered())
            System.out.println(answer.toString());
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
        answer.setUserAnswer(userAnswer);
        if (answer.isAnswered())
            System.out.println(answer.toString());
        System.out.println("Your time: " + time + " sec");
        System.out.println("Computer time: " + computerTime + " ms");
    }
}
