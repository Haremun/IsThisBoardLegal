package com.bieganski.main_classes;

import java.util.concurrent.TimeUnit;

class Stopwatch {
    private long startTimeInNano;
    //private long stopTimeInNano;
    private long timeInNano;

    Stopwatch() {
    }

    void startMeasure() {
        timeInNano = 0;
        startTimeInNano = System.nanoTime();
    }

    void stopMeasure() {
        timeInNano = System.nanoTime() - startTimeInNano;
    }

    long getTimeInNano() {
        return timeInNano;
    }
    long getTimeInMili(){
        return TimeUnit.NANOSECONDS.toMillis(timeInNano);
    }
    long getTimeInSec(){
        return TimeUnit.NANOSECONDS.toSeconds(timeInNano);
    }

    @Override
    public String toString() {
        return TimeUnit.NANOSECONDS.toSeconds(timeInNano) + " sec";
    }
}
