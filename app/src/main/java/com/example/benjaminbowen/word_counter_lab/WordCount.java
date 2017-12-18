package com.example.benjaminbowen.word_counter_lab;

import java.util.HashMap;

/**
 * Created by benjaminbowen on 18/12/2017.
 */

public class WordCount {

    String input;

    public WordCount(String input){
        this.input = input;
    }

    public String[] convertStringToArray(){
        String lower_case = this.input.toLowerCase();
        String no_commas = lower_case.replace(',', ' ');
        String no_periods = no_commas.replace('.', ' ');
        return no_periods.split("\\s+");
    }

    public int getWordCount(){
        return this.convertStringToArray().length;
    }

    public HashMap<String, Integer> countOccurences(){
        HashMap<String, Integer> countHashMap = new HashMap<>();
        for (String word : this.convertStringToArray()){
            if( !countHashMap.keySet().contains(word)){
                countHashMap.put(word, 1);
            }
            else{countHashMap.put(word, countHashMap.get(word)+1);}
        }
        return countHashMap;
    }


}
