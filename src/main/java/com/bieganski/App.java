package com.bieganski;

import com.bieganski.board.Board;
import com.bieganski.board.BoardParser;
import com.bieganski.board.BoardReader;
import com.bieganski.board.GameChecker;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GameThread gameThread = new GameThread();
        gameThread.start();
    }

}
