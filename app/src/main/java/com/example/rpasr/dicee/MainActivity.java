package com.example.rpasr.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;

        rollButton = findViewById(R.id.roll);

        final ImageView leftDice =  findViewById(R.id.leftdecie);

        final ImageView rightDice = findViewById(R.id.rightDice);
        final int [] DICEArray = {R.drawable.dice1,
                R.drawable.dice2,R.drawable.dice3,R.drawable.dice4 ,R.drawable.dice5
                ,R.drawable.dice6};



    // detect taps on screen

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Log.d("Dicee","pressed button");
                Random randomNumberGenerator = new Random ();

                int numberDiceone = randomNumberGenerator.nextInt(6);
                int numberDicetwo = randomNumberGenerator.nextInt(6);

                Log.d("Dicee","The number is " +numberDiceone);

                leftDice.setImageResource(DICEArray[numberDiceone]);
                rightDice.setImageResource((DICEArray[numberDicetwo]));


            }
        });



    }
}
