package view.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AlertBoxController {
    @FXML
    private Label text;

    @FXML
    void initialize(){
        text.setText("Dziękujemy");
    }
}