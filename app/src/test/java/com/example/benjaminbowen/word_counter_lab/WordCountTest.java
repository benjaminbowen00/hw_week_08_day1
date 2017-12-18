package com.example.benjaminbowen.word_counter_lab;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by benjaminbowen on 18/12/2017.
 */

public class WordCountTest {

    WordCount input;
    WordCount input2;
    WordCount input3;


    @Before
    public void before(){
        input = new WordCount("Hello World");
        input2 = new WordCount("It's not the end of the world if you miss it");
        input3 = new WordCount("why, why me.");

    }

    @Test
    public void canGetWordCount(){
        assertEquals(2, input.getWordCount());
    }

    @Test
    public void canGetWordCountLonger(){
        assertEquals(11, input2.getWordCount());
    }

    @Test
    public void canGetCountHashMap(){
        HashMap<String, Integer> result = input3.countOccurences();
        Integer test = 2;
        Integer test2 = 1;
        assertEquals(test, result.get("why"));
        assertEquals(test2, result.get("me"));

    }
}
