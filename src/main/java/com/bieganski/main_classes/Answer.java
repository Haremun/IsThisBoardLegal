package com.bieganski.main_classes;

class Answer {
    private boolean userAnswer;
    private boolean computerAnswer;
    private boolean answered;

    Answer() {
        answered = false;
    }

    void setUserAnswer(boolean userAnswer) {
        this.userAnswer = userAnswer;
        answered = true;
    }

    void setComputerAnswer(boolean computerAnswer) {
        this.computerAnswer = computerAnswer;
        answered = true;
    }

    boolean isAnswered() {
        return answered;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (userAnswer == computerAnswer)
            builder.append("You are right");
        else
            builder.append("You are wrong");
        builder.append(", ");
        if (computerAnswer)
            builder.append("Board is legal");
        else
            builder.append("Board is illegal");
        return builder.toString();
    }
}
