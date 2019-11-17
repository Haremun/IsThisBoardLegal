package com.bieganski;

import java.util.concurrent.TimeUnit;

public class MeasureTime {
    private long startTimeInNano;
    private long stopTimeInNano;

    public MeasureTime() {
    }

    public void startMeasure() {
        startTimeInNano = System.nanoTime();
    }

    public void stopMeasure() {
        stopTimeInNano = System.nanoTime();
    }

    @Override
    public String toString() {
        return TimeUnit.NANOSECONDS.toSeconds(stopTimeInNano - startTimeInNano) + " sec";
    }
}
