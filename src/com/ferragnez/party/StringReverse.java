package com.ferragnez.party;

public class StringReverse {
    public static void main(String[] args) {
        String word = "Ciao";
        String reverseWord = "";
        for (int i = 0; i < word.length(); i++){
            reverseWord = word.charAt(i) + reverseWord;
        }

        System.out.println(reverseWord);
    }
}
