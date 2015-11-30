package com.example.myappportfolio;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button spotfyButton;
    private Button scoreButton;
    private Button libratyButton;
    private Button buildButton;
    private Button xyzreaderButton;
    private Button capstoneButton;
    private TextView appTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotfyButton = (Button) findViewById(R.id.spotifyButton);
        scoreButton = (Button) findViewById(R.id.scoreappButton);
        libratyButton = (Button) findViewById(R.id.libraryappButton);
        buildButton = (Button) findViewById(R.id.buildItBiggerButton);
        xyzreaderButton = (Button) findViewById(R.id.xyzReaderButton);
        capstoneButton = (Button) findViewById(R.id.capstoneButton);
        appTitle = (TextView) findViewById(R.id.app_titleId);

        spotfyButton.setOnClickListener(this);
        scoreButton.setOnClickListener(this);
        libratyButton.setOnClickListener(this);
        buildButton.setOnClickListener(this);
        xyzreaderButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.spotifyButton:{
                spotfyButton.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this,"This button will launches Sportify!",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.scoreappButton:{
                scoreButton.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this,"This button will launches Score App!",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.libraryappButton:{
                libratyButton.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this,"This button will launches Library App!",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buildItBiggerButton:{
                buildButton.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this,"This button will launches Build IT Bigger!",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.xyzReaderButton:{
                xyzreaderButton.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this,"This button will launch XYZ Reader app!",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.capstoneButton:{
                capstoneButton.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this,"This button Will launches castone app!",Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
