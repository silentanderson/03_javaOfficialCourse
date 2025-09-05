package com.ohgiraffers.level02.normal;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        int result = (int) (Math.random() * (max-min+1) + min);
        return result;
    }

    public String randomUpperAlphabet(int length) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetRandom = "";

        for (int i=0; i<length; i++) {
            int idxRandom = (int) (Math.random() * length);
            char tmpCh = alphabet.charAt(idxRandom);
            alphabetRandom += tmpCh;
        }
        return alphabetRandom;
    }

    public String rockPaperScissors() {
        String[] choices = {"가위","바위","보"};
        int idxRandom = (int) (Math.random() * choices.length);
        return choices[idxRandom];
    }

    public String tossCoin() {
        String[] frontBack = {"앞면","뒷면"};
        int idxRandom = (int) (Math.random() * frontBack.length);
        return frontBack[idxRandom];
    }

}
