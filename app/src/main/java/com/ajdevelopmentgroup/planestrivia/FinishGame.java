package com.ajdevelopmentgroup.planestrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class FinishGame extends AppCompatActivity {



    Button shareScoreButton;
    TextView scoreTextView;
    String scoreString;
    double scorePercent;
    String quizName;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plane_types_finish_game);





        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                scoreString= null;
            } else {
                scoreString= extras.getString("STRING_I_NEED");
            }
        } else {
            scoreString= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                scorePercent= 0;
            } else {
                scorePercent = extras.getDouble("SCORE_I_NEED");
            }
        } else {
            scorePercent= (double) savedInstanceState.getSerializable("SCORE_I_NEED");
        }

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                quizName = null;
            } else {
                quizName = extras.getString("QUIZ_NAME");
            }
        } else {
            quizName = (String) savedInstanceState.getSerializable("QUIZ_NAME");
        }
        ImageView image1 = findViewById(R.id.imageViewGoodGame);
        if(scorePercent > 90){
            Picasso.get().load("https://i.pinimg.com/originals/e5/87/2e/e5872efb00f45f2dc39c4d84ac5014da.jpg").fit().centerInside().into(image1);
        }
        else if(scorePercent > 80){
            Picasso.get().load("https://www.pinclipart.com/picdir/middle/241-2411088_silver-trophy-clipart.png").fit().centerInside().into(image1);
        }
        else{
            Picasso.get().load("https://www.clipartmax.com/png/middle/92-927572_missions-bronze-trophy-render-award.png").fit().centerInside().into(image1);
        }


        scoreTextView = findViewById(R.id.textViewScore);
        shareScoreButton = findViewById(R.id.buttonShareScore);
        scoreTextView.setText(scoreString);
        shareScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Planes Trivia app@https://play.google.com/store/apps/details?id=com.ajdevelopmentgroup.planestrivia \n \nI made a "+scorePercent+"% on the "+quizName+"Quiz on the Planes Trivia App");
                startActivity(Intent.createChooser(shareIntent, "Share Your Score Using This:"));
            }
        });
    }
}
