package com.codecool.thehistory;

import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        String[] newWordsArray = text.split("\\s+");
        String[] tempWordsArray = new String[this.size() + newWordsArray.length];
        System.arraycopy(this.wordsArray, 0, tempWordsArray, 0, this.size());
        System.arraycopy(newWordsArray, 0, tempWordsArray, this.size(), newWordsArray.length);
        this.wordsArray = tempWordsArray;
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return this.wordsArray.length;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        //Arrays.fill(this.wordsArray, null);
        this.wordsArray = new String[0];
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        System.out.println(from + " " + to);
        for (int i = 0; i < this.size(); i++) {
            if (from.equals(this.wordsArray[i])) {
                this.wordsArray[i] = to;
            }
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
