package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View view)
    {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void addTwoForTeamA(View view)
    {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void addFreeForTeamA(View view)
    {
        scoreA=scoreA+1;

        displayForTeamA(scoreA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View view)
    {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void addTwoForTeamB(View view)
    {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void addFreeForTeamB(View view)
    {
        scoreB=scoreB+1;

        displayForTeamB(scoreB);
    }
    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}