package com.londonappbrewery.quizzler;

/**
 * Created by John on 11/6/2017.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionResourceId, boolean trueOrFlase){
        mQuestionID = questionResourceId;
        mAnswer = trueOrFlase;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
