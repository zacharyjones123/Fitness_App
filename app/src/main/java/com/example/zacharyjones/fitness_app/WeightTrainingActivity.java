package com.example.zacharyjones.fitness_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zachary Jones on 4/12/2016.
 */
public class WeightTrainingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_training);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Button weightTraining_BackEdit = (Button) findViewById(R.id.weightTrainingBack_button);
        weightTraining_BackEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button weightTraining_MondayEdit = (Button) findViewById(R.id.weightTrainingMonday_button);
        weightTraining_MondayEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, MondayActivity.class);
                startActivity(intent);
            }
        });

        Button weightTraining_TuesdayEdit = (Button) findViewById(R.id.weightTrainingTuesday_button);
        weightTraining_TuesdayEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, TuesdayActivity.class);
                startActivity(intent);
            }
        });

        Button weightTraining_WednesdayEdit = (Button) findViewById(R.id.weightTrainingWednesday_button);
        weightTraining_WednesdayEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, WednesdayActivity.class);
                startActivity(intent);
            }
        });

        Button weightTraining_ThursdayEdit = (Button) findViewById(R.id.weightTrainingThursday_button);
        weightTraining_ThursdayEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, ThursdayActivity.class);
                startActivity(intent);
            }
        });

        Button weightTraining_FridayEdit = (Button) findViewById(R.id.weightTrainingFriday_button);
        weightTraining_FridayEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, FridayActivity.class);
                startActivity(intent);
            }
        });

        Button weightTraining_SaturdayEdit = (Button) findViewById(R.id.weightTrainingSaturday_button);
        weightTraining_SaturdayEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, SaturdayActivity.class);
                startActivity(intent);
            }
        });

        Button weightTraining_SundayEdit = (Button) findViewById(R.id.weightTrainingSunday_button);
        weightTraining_SundayEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WeightTrainingActivity.this, SundayActivity.class);
                startActivity(intent);
            }
        });

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
        getMenuInflater().inflate(R.menu.menu_purpose, menu);
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
