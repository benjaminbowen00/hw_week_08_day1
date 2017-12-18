package com.example.benjaminbowen.word_counter_lab;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText inputText;
    TextView titleText;
    TextView outputText;
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        inputText = findViewById(R.id.input_string);
        titleText = findViewById(R.id.header);
        outputText = findViewById(R.id.output);
        convertButton = findViewById(R.id.convert_button);
    }
    public void onCountButtonClicked(View button){
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        String input = inputText.getText().toString();

        WordCount words = new WordCount(input);

        outputText.setText("There are "+ words.getWordCount() + " words");

    }


}
