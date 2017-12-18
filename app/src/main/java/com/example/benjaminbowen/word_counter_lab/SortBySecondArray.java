package com.example.benjaminbowen.word_counter_lab;

/**
 * Created by benjaminbowen on 18/12/2017.
 */

import java.util.ArrayList;
import java.util.Comparator;

public class SortBySecondArray implements Comparator<ArrayList<String>> {


    public int compare(ArrayList<String> a, ArrayList<String> b) {
        return -a.get(1).compareTo(b.get(1));
    }


}