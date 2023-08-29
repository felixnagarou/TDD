package org.example.hangmanGame;

public class Game {
    private WordSetGenerator wordSet;
    private String wordToFind;
    private char charInput;
    private boolean wordIsFound;
    private int numberOfTries;
    private int triesCounter;

    private boolean isCharFound;

    public Game (WordSetGenerator wordSet){
        this.wordSet = wordSet;
    }

    public WordSetGenerator getWordSet() {
        return wordSet;
    }

    public void setWordSet(WordSetGenerator wordSet) {
        this.wordSet = wordSet;
    }

    public boolean isWordIsFound() {
        return wordIsFound;
    }

    public void setWordIsFound(boolean wordIsFound) {
        this.wordIsFound = wordIsFound;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public int getTriesCounter() {
        return triesCounter;
    }

    public void setTriesCounter(int triesCounter) {
        this.triesCounter = triesCounter;
    }

    public char getCharInput() {
        return charInput;
    }

    public void setCharInput(char charInput) {
        this.charInput = charInput;
    }

    public boolean isCharFound() {
        return isCharFound;
    }

    public String getWordToFind() {
        return wordToFind;
    }
}
