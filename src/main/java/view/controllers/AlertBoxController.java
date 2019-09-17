package view.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class AlertBoxController {
    @FXML
    private Label text;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    void initialize(){
        text.setText("Dziękujemy");
        setBackGround();

    }
    private void setBackGround(){
        BackgroundImage myBI= new BackgroundImage(new Image(getClass().getResourceAsStream("/background.png")),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        anchorPane.setBackground(new Background(myBI));
    }
}