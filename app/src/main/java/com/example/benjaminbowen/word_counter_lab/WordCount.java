package com.example.benjaminbowen.word_counter_lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by benjaminbowen on 18/12/2017.
 */

public class WordCount {

    private String input;
    private HashMap<String, String> hmap;
    private ArrayList<ArrayList<String>> arrarr;

    public WordCount(String input){
        this.input = input;
        this.hmap = convertHashMapToStrings();
        this.arrarr = convertHashMapToArrayList();


    }

    public String[] convertStringToArray(){
        this.input = this.input.toLowerCase();
        this.input = this.input.replace(',', ' ');
        this.input = this.input.replace('.', ' ');
        return this.input.split("\\s+");
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

    public HashMap<String, String> convertHashMapToStrings(){
        HashMap<String, String> newHMap = new HashMap<>();
        for(String key : this.countOccurences().keySet()){
            newHMap.put(key, this.countOccurences().get(key).toString());
        }
        return newHMap;
    }

    public ArrayList<ArrayList<String>>  convertHashMapToArrayList(){
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for(String key : this.hmap.keySet()){
            ArrayList<String> inner = new ArrayList<>();
            inner.add(key);
            inner.add(hmap.get(key));
            output.add(inner);
        }
        return output;
    }

    public ArrayList<ArrayList<String>> orderArrayArrayList(){
        Collections.sort(this.arrarr, new SortBySecondArray());
        return this.arrarr;
    }


    public String prettyPrintHashMap(){
        String output = "";
        HashMap<String, Integer> hmap = this.countOccurences();
        for(String key : hmap.keySet()){
            output += key + ":"+ hmap.get(key)+"\n";
        }
        return output;
    }

    public String prettyPrintArrayList(){
        String output = "";
        for(ArrayList<String> arrList2 : orderArrayArrayList()){
            output += arrList2.get(0) + " : " + arrList2.get(1) + "\n";
        }
        return output;
    }


}
