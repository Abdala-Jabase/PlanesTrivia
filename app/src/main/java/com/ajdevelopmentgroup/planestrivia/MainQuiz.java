package com.ajdevelopmentgroup.planestrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.Random;

public class MainQuiz extends AppCompatActivity {

    TextView scoreTextView;
    TextView questionTextView;
    Button topLeftButton;
    Button topRightButton;
    Button bottomLeftButton;
    Button bottomRightButton;
    ImageView questionImage;
    int clicks = 0;
    ListPlaneQuestions listPlaneQuestions = new ListPlaneQuestions();
    String questionImageUrl;
    String planeType;
    String[] choices;
    int index = 0;
    int score =0;
    String scoreText;
    String quizName;
    String question;
    private int numOfQuestions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
        // Get quiz name from Intent
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                quizName= null;
            } else {
                quizName= extras.getString("STRING_I_NEED");
            }
        } else {
            quizName= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                numOfQuestions= 0;
            } else {
                numOfQuestions= extras.getInt("NUM_OF_QUESTIONS");
            }
        } else {
            numOfQuestions= (int) savedInstanceState.getSerializable("STRING_I_NEED");
        }

        if (savedInstanceState != null) {
            numOfQuestions= (int) (savedInstanceState).getSerializable("NUM_OF_QUESTIONS");
        }

        //Pick the question set based on quiz name
        if(quizName.equals("Planes Types")) {
            listPlaneQuestions.planesTypesQuestions();
            question = "What type of plane is this?";
        }
        else if(quizName.equals("Airlines Logos")){
            listPlaneQuestions.airlinesLogosQuestions();
            question = "What airline's logo is this?";
        }
        else if(quizName.equals("Helicopter Types")){
            listPlaneQuestions.helicopterTypesQuestions();
            question = "What type of helicopter is this?";
        }
        listPlaneQuestions.randomizeList();

        questionImageUrl = listPlaneQuestions.getQuestionAtIndex(index).getImageUrl();
        planeType = listPlaneQuestions.getQuestionAtIndex(index).getAnswer();
        choices = listPlaneQuestions.getQuestionAtIndex(index).getChoices();
        scoreText = "Score: "+score+"/"+numOfQuestions;

        scoreTextView = findViewById(R.id.scoreTextView);
        questionTextView = findViewById(R.id.questionTextView);
        topLeftButton = findViewById(R.id.buttonTopLeft);
        topRightButton = findViewById(R.id.buttonTopRight);
        bottomLeftButton = findViewById(R.id.buttonBottomLeft);
        bottomRightButton = findViewById(R.id.buttonBottomRight);
        questionImage = findViewById(R.id.questionImageView);


        makeRandom();
        scoreTextView.setText(scoreText);
        topLeftButton.setText(choices[0]);
        topRightButton.setText(choices[1]);
        bottomLeftButton.setText(choices[2]);
        bottomRightButton.setText(choices[3]);


        final int time = 1500;






        Picasso.get().load(questionImageUrl).fit().centerInside().into(questionImage);
        questionTextView.setText(index+1+". "+question);
        topLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                clicks++;
                if (clicks == 1){
                    topLeftButton.setEnabled(false);
                    topRightButton.setEnabled(false);
                    bottomRightButton.setEnabled(false);
                    bottomLeftButton.setEnabled(false);
                }

                if(listPlaneQuestions.getQuestionAtIndex(index).getAnswer().equals(choices[0])){
                    topLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    score++;


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);
                }
                else{
                    topLeftButton.setBackground(getResources().getDrawable(R.drawable.red_btn));
                    if(bottomLeftButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        bottomLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(topRightButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        topRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(bottomRightButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        bottomRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);

                }

            }
        });
        topRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicks++;
                if (clicks == 1){
                    topLeftButton.setEnabled(false);
                    topRightButton.setEnabled(false);
                    bottomRightButton.setEnabled(false);
                    bottomLeftButton.setEnabled(false);
                }

                if(listPlaneQuestions.getQuestionAtIndex(index).getAnswer().equals(choices[1])){
                    topRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    score++;


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);
                }
                else{
                    topRightButton.setBackground(getResources().getDrawable(R.drawable.red_btn));
                    if(bottomLeftButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        bottomLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(bottomRightButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        bottomRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(topLeftButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        topLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);
                }

            }
        });

        bottomLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicks++;
                if (clicks == 1){
                    topLeftButton.setEnabled(false);
                    topRightButton.setEnabled(false);
                    bottomRightButton.setEnabled(false);
                    bottomLeftButton.setEnabled(false);
                }

                if(listPlaneQuestions.getQuestionAtIndex(index).getAnswer().equals(choices[2])){
                    bottomLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    score++;


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);
                }
                else{
                    bottomLeftButton.setBackground(getResources().getDrawable(R.drawable.red_btn));
                    if(bottomRightButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        bottomRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(topRightButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        topRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(topLeftButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        topLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);

                }
            }
        });

        bottomRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicks++;
                if (clicks == 1){
                    topLeftButton.setEnabled(false);
                    topRightButton.setEnabled(false);
                    bottomRightButton.setEnabled(false);
                    bottomLeftButton.setEnabled(false);
                }

                if(listPlaneQuestions.getQuestionAtIndex(index).getAnswer().equals(choices[3])){
                    bottomRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    score++;

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);


                }
                else{
                    bottomRightButton.setBackground(getResources().getDrawable(R.drawable.red_btn));
                    if(bottomLeftButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        bottomLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(topRightButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        topRightButton.setBackground(getResources().getDrawable(R.drawable.green_btn));
                    if(topLeftButton.getText().equals(listPlaneQuestions.getQuestionAtIndex(index).getAnswer()))
                        topLeftButton.setBackground(getResources().getDrawable(R.drawable.green_btn));

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            updateQuestion();
                        }
                    }, time);

                }
            }
        });







        }

        public void updateQuestion() {

            clicks = 0;
            topLeftButton.setEnabled(true);
            topRightButton.setEnabled(true);
            bottomRightButton.setEnabled(true);
            bottomLeftButton.setEnabled(true);


            topRightButton.setBackground(getResources().getDrawable(R.drawable.question_btn));
            topLeftButton.setBackground(getResources().getDrawable(R.drawable.question_btn));
            bottomRightButton.setBackground(getResources().getDrawable(R.drawable.question_btn));
            bottomLeftButton.setBackground(getResources().getDrawable(R.drawable.question_btn));

            if (index < numOfQuestions - 1) {
                scoreText = "Score: " + score + "/" + numOfQuestions;
                scoreTextView.setText(scoreText);
                index++;
                questionTextView.setText(index+1+". "+question);
                questionImageUrl = listPlaneQuestions.getQuestionAtIndex(index).getImageUrl();
                planeType = listPlaneQuestions.getQuestionAtIndex(index).getAnswer();
                choices = listPlaneQuestions.getQuestionAtIndex(index).getChoices();
                Picasso.get().load(questionImageUrl).fit().centerInside().into(questionImage);
                makeRandom();
                topLeftButton.setText(choices[0]);
                topRightButton.setText(choices[1]);
                bottomLeftButton.setText(choices[2]);
                bottomRightButton.setText(choices[3]);


            } else {
                scoreText = "Score: " + score + "/" + numOfQuestions;
                double scorePercent = ((double) score / numOfQuestions) * 100;
                scorePercent = Math.round(scorePercent * 100.0) / 100.0;
                String scoreString = "Good game thank you for playing, you got " + score + " out of " + numOfQuestions + " " + scorePercent + "%";
                Intent finishGame = new Intent(MainQuiz.this, FinishGame.class);
                finishGame.putExtra("STRING_I_NEED", scoreString);
                finishGame.putExtra("SCORE_I_NEED", scorePercent);
                finishGame.putExtra("QUIZ_NAME", quizName);
                startActivity(finishGame);


            }
        }

        public void makeRandom(){
                Random rand = new Random();

                for (int i = 0; i < choices.length; i++) {
                    int randomIndexToSwap = rand.nextInt(choices.length);
                    String temp = choices[randomIndexToSwap];
                    choices[randomIndexToSwap] = choices[i];
                    choices[i] = temp;

            }




        }







    }


