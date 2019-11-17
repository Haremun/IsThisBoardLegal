package com.bieganski;

import java.util.concurrent.TimeUnit;

public class Stopwatch {
    private long startTimeInNano;
    private long stopTimeInNano;
    private long timeInNano;

    public Stopwatch() {
    }

    public void startMeasure() {
        startTimeInNano = System.nanoTime();
    }

    public void stopMeasure() {
        stopTimeInNano = System.nanoTime();
        timeInNano = stopTimeInNano - startTimeInNano;
    }

    public long getTimeInNano() {
        return timeInNano;
    }
    public long getTimeInMili(){
        return TimeUnit.NANOSECONDS.toMillis(timeInNano);
    }
    public long getTimeInSec(){
        return TimeUnit.NANOSECONDS.toSeconds(timeInNano);
    }

    @Override
    public String toString() {
        return TimeUnit.NANOSECONDS.toSeconds(timeInNano) + " sec";
    }
}
