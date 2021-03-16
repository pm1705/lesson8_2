package com.example.lesson8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sw1;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    Button b1;
    View main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw1 = (Switch) findViewById(R.id.sw1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        b1 = (Button)findViewById(R.id.b1);
        main = (View) findViewById(R.id.main);
    }


    public void rgclick(View view) {
        if (!sw1.isChecked()){
            if (rb1.isChecked()){
                main.setBackgroundColor(Color.rgb(255, 153, 255));
            }
            else if (rb2.isChecked()){
                main.setBackgroundColor(Color.rgb(204, 153, 255));
            }
            else if (rb3.isChecked()){
                main.setBackgroundColor(Color.rgb(153, 204, 255));
            }
            else if (rb4.isChecked()){
                main.setBackgroundColor(Color.rgb(1, 204, 102));
            }
        }
    }

    public void click(View view) {
        if (rb1.isChecked()){
            main.setBackgroundColor(Color.rgb(255, 153, 255));
        }
        else if (rb2.isChecked()){
            main.setBackgroundColor(Color.rgb(204, 153, 255));
        }
        else if (rb3.isChecked()){
            main.setBackgroundColor(Color.rgb(153, 204, 255));
        }
        else if (rb4.isChecked()){
            main.setBackgroundColor(Color.rgb(1, 204, 102));
        }
    }
}