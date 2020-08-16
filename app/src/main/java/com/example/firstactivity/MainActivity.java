package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import static com.example.firstactivity.Toast.setGravity;

public class MainActivity extends AppCompatActivity {
    Button button;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonLister();
    }

    public void OnclickButtonLister(){
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Context context = getApplicationContext();
                        CharSequence text = "Navigating Activity 2";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toest = Toast.makeText(context, text, duration);

                        Toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                        Toast.show();



                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);

                    }

                    private void setGravity(int i, int i1, int i2) {

                    }
                }
        );
    }

}