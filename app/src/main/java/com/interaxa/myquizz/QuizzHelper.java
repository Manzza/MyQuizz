package com.interaxa.myquizz;


/**
 * Created by Manzza on 19/02/2017.
 */

public class QuizzHelper {

    protected boolean questionOne = false;
    protected boolean questionTwo= false;
    protected boolean questionThree= false;
    protected boolean questionFour= false;
    private String  answerTwo ;
    private String  answerFour;
    private boolean checkBoxOne= false;
    private boolean checkBoxTwo= false;
    private boolean checkBoxThree= false;
    private boolean checkBoxFour= false;
    private boolean radioOne= false;
    private boolean radioTwo= false;
    private boolean radioThree= false;
    private boolean radioFour= false;
    private int result = 0;


    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public boolean isCheckBoxOne() {
        return checkBoxOne;
    }

    public void setCheckBoxOne(boolean checkBoxOne) {
        this.checkBoxOne = checkBoxOne;
    }

    public boolean isCheckBoxTwo() {
        return checkBoxTwo;
    }

    public void setCheckBoxTwo(boolean checkBoxTwo) {
        this.checkBoxTwo = checkBoxTwo;
    }

    public boolean isCheckBoxThree() {
        return checkBoxThree;
    }

    public void setCheckBoxThree(boolean checkBoxThree) {
        this.checkBoxThree = checkBoxThree;
    }

    public boolean isCheckBoxFour() {
        return checkBoxFour;
    }

    public void setCheckBoxFour(boolean checkBoxFour) {
        this.checkBoxFour = checkBoxFour;
    }

    public String getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(String answerFour) {
        this.answerFour = answerFour;
    }

    public int getResult() {
        return result;
    }

    public boolean isRadioOne() {
        return radioOne;
    }

    public void setRadioOne(boolean radioOne) {
        this.radioOne = radioOne;
    }

    public boolean isRadioTwo() {
        return radioTwo;
    }

    public void setRadioTwo(boolean radioTwo) {
        this.radioTwo = radioTwo;
    }

    public boolean isRadioThree() {
        return radioThree;
    }

    public void setRadioThree(boolean radioThree) {
        this.radioThree = radioThree;
    }

    public boolean isRadioFour() {
        return radioFour;
    }

    public void setRadioFour(boolean radioFour) {
        this.radioFour = radioFour;
    }
    public void setQuestionOne(boolean value) {
        questionOne = value;
        this.result+=1;
    }

    public void setQuestionTwo(boolean value) {
        questionTwo = value;
        this.result+=1;
    }

    public void setQuestionThree(boolean value) {
        questionThree = value;
        this.result+=1;
    }
    public void setQuestionFour(boolean value) {
        questionFour = value;
        this.result+=1;
    }

}
