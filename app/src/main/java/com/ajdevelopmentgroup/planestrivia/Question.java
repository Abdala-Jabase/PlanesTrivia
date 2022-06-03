package com.ajdevelopmentgroup.planestrivia;


import java.util.ArrayList;

public class Question{

    private String imageUrl;
    private String answer;
    private String[] choices;


    public Question(String answer, String imageUrl, String[] choices) {
        this.imageUrl = imageUrl;
        this.answer = answer;
        this.choices = choices;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String planeType) {
        this.answer = planeType;

    }

    public String getImageUrl() {
        return imageUrl;

    }

    public void setImageUrl(String imageUrl) {

        this.imageUrl = imageUrl;
    }

    public void setChoices(String[] choices){
       this.choices = choices;

    }
    public String[] getChoices(){

        return choices;
    }


}
