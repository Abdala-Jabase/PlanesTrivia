package com.ajdevelopmentgroup.planestrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Spinner quizSpinner;
    private Spinner numberQuestionSpinner;
    private String quizType;
    private int numberOfQuestions;
    private ListPlaneQuestions listOfQuestions = new ListPlaneQuestions();
    private ArrayList<String> numQuestions = new ArrayList<>();
    private ArrayAdapter<String> numQuestionsAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizSpinner = (Spinner) findViewById(R.id.spinnerQuiz);
        numberQuestionSpinner = (Spinner) findViewById(R.id.spinnerQuestions);
        Button startButton = (Button) findViewById(R.id.buttonStart);
        numberQuestionSpinner.setEnabled(false);
        ArrayList<String> quizzesList = new ArrayList<String>();
        quizzesList.add("Airlines Logos");
        quizzesList.add("Planes Types");
        quizzesList.add("Helicopter Types");
        ArrayAdapter<String> quizzesAdapter = new ArrayAdapter<String>(this, R.layout.spinner_style, quizzesList);
        quizzesAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        quizSpinner.setAdapter(quizzesAdapter);
        quizSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                quizType = quizSpinner.getSelectedItem().toString();
                numberQuestionSpinner.setEnabled(true);
                listOfQuestions.getQuestions().clear();
                if(quizType.equals("Airlines Logos")){
                    listOfQuestions.airlinesLogosQuestions();
                }
                else if(quizType.equals("Planes Types")){
                    listOfQuestions.planesTypesQuestions();
                }
                else if(quizType.equals("Helicopter Types")){
                    listOfQuestions.helicopterTypesQuestions();
                }
                numQuestions.clear();
                for(int i = 5; i <= listOfQuestions.getQuestions().size(); i+=5){
                    numQuestions.add(""+i);

                }
                numQuestions.add("All available");
                numQuestionsAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_style, numQuestions);
                numQuestionsAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
                numberQuestionSpinner.setAdapter(numQuestionsAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                numberQuestionSpinner.setEnabled(false);
                Context context = getApplicationContext();
                CharSequence text = "Please fill all fields";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });




        numberQuestionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (numberQuestionSpinner.getSelectedItem().toString().contains("All available")) {
                    numberOfQuestions = listOfQuestions.getQuestions().size();
                } else {
                    numberOfQuestions = Integer.parseInt(numberQuestionSpinner.getSelectedItem().toString());
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Context context = getApplicationContext();
                CharSequence text = "Please fill all fields";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    Intent beginQuiz = new Intent(getApplicationContext(), MainQuiz.class);
                    beginQuiz.putExtra("STRING_I_NEED", quizType);
                    beginQuiz.putExtra("NUM_OF_QUESTIONS", numberOfQuestions);
                    startActivity(beginQuiz);








            }
        });






    }
}
