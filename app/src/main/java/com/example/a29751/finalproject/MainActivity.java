package com.example.a29751.finalproject;
/**
 * Date: 2017-10-31
 * Created by Liangliang Du
 * Teamwork: Cheng Yan & Wang Yongdan & Du Liangliang & Hao Fanyu
 * This is the main interface
 *
 *
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button activityTrack = (Button) findViewById(R.id.activityLaunch);//wang
        Button foodNutrition = (Button) findViewById(R.id.FoodLaunch);//du
        Button houseThermostat = (Button) findViewById(R.id.HouseLaunch);//cheng
        Button autoMobile = (Button) findViewById(R.id.autolaunch);//hao

        activityTrack.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(MainActivity.this,ActivityTracking.class));
          }
        });

        foodNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FoodNutrition.class));
            }
        });

        houseThermostat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HouseThermostat.class));
            }
        });

        autoMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Automobile.class));
            }
        });
    }
}
