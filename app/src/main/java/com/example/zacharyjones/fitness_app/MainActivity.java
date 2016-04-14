package com.example.zacharyjones.fitness_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button purposeEdit = (Button) findViewById(R.id.purpose_button);
        purposeEdit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PurposeActivity.class);
                startActivity(intent);
            }
        });

        Button nutritionEdit = (Button) findViewById(R.id.nutrition_button);
        nutritionEdit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NutritionActivity.class);
                startActivity(intent);
            }
        });

        Button cardioEdit = (Button) findViewById(R.id.cardio_button);
        cardioEdit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardioActivity.class);
                startActivity(intent);
            }
        });

        Button weightTrainingEdit = (Button) findViewById(R.id.weightTraining_button);
        weightTrainingEdit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeightTrainingActivity.class);
                startActivity(intent);
            }
        });

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
