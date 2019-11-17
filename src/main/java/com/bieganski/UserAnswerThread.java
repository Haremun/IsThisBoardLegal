package com.bieganski;

import com.bieganski.listeners.UserAnswerListener;

import java.util.Scanner;

public class UserAnswerThread extends Thread {
    private UserAnswerListener listener;
    private boolean answered;

    public UserAnswerThread(UserAnswerListener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        System.out.println("Is this board legal? (Y/N)");

        Stopwatch stopwatch = new Stopwatch();
        Scanner in = new Scanner(System.in);
        answered = false;
        while (!answered) {
            stopwatch.startMeasure();
            String userInput = in.nextLine();
            if (userInput.equals("Y")) {
                stopwatch.stopMeasure();
                answered = true;
                listener.onUserAnswer(true, stopwatch.getTimeInSec());
            } else if (userInput.equals("N")) {
                stopwatch.stopMeasure();
                answered = true;
                listener.onUserAnswer(false, stopwatch.getTimeInSec());
            } else {
                System.out.println("Wrong letter, try again");
                answered = false;
            }
        }
        in.close();
    }
}
