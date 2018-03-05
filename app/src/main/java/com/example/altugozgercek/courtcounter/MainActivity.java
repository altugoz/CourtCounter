package com.example.altugozgercek.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void changeText(){
        TextView textChanger = (TextView) findViewById(R.id.team_b_score);
        textChanger.setText("altug");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Displays the given score for Team A.
     */


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void three_points_btn(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void two_points_btn(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void free_throw_btn(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A
     */

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void three_points_btnB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void two_points_btnB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void free_throw_btnB(View v){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetButton(View v){
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
