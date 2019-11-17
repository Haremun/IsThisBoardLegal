package com.bieganski;

import com.bieganski.main_threads.GameThread;

public class App {
    public static void main(String[] args) {
        new GameThread().start();
    }
}
