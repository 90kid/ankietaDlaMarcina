package controllers;

import controllers.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.Question;


public class StatBoxController {

    @FXML private Label question1Label;
    @FXML private Label question2Label;
    @FXML private Label question3Label;
    @FXML
    void initialize(){
        question1Label.setText(getLabelContent(Controller.getQuestion1()));
        question2Label.setText(getLabelContent(Controller.getQuestion2()));
        question3Label.setText((getLabelContent(Controller.getQuestion3())));
    }

    private String getLabelContent(Question question){
        return question.getContent() + " Happy:" + question.getHappyCounter() + " Mid:" + question.getMidCounter() + " Sad:" + question.getSadCounter();
    }
}