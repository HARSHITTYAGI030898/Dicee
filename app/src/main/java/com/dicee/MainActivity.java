package com.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton = findViewById(R.id.rollbutton);

        final ImageView leftdice = findViewById(R.id.image_leftdice);

        final ImageView rightdice = findViewById(R.id.image_rightdice);

        final int[] dicearray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Log.d("Dicee", "onClick: Ze button has been pressed");

                Random randomnumbergenerator = new Random();
                int number = randomnumbergenerator.nextInt(6);
                Log.d("Dicee", "The Random No Is: " + number);
                leftdice.setImageResource(dicearray[number]);

                number = randomnumbergenerator.nextInt(6);
                Log.d("Dicee", "The random no is: " + number);

                rightdice.setImageResource(dicearray[number]);

            }
        });

    }
}