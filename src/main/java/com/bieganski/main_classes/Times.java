package com.bieganski.main_classes;

class Times {
    private long computerTime;
    private long userTime;

    void setComputerTime(long computerTime) {
        this.computerTime = computerTime;
    }

    void setUserTime(long userTime) {
        this.userTime = userTime;
    }

    @Override
    public String toString() {
        return "Your time: " + userTime + " sec\n" +
                "Computer time: " + computerTime + " ms\n";
    }
}
