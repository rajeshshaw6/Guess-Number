package com.example.android.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void makeToast(String string){
        Toast.makeText(this,string, Toast.LENGTH_SHORT).show();
    }
    public void guess(View view){
        EditText guessText = findViewById(R.id.guessText);
        int guessInt = Integer.parseInt(guessText.getText().toString());
        if(guessInt>randomNumber) {
            makeToast("Lower!");
        }else if(guessInt<randomNumber){
            makeToast("Higher!");
        }else {
            makeToast("That's Right! Try Again!");
            Random rand = new Random();
            randomNumber = rand.nextInt(20)+1;
        }
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

    }
}


