package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;

public class Controller {
    @FXML
    private Button acceptationButton;
    @FXML
    private RadioButton happyQ1;
    @FXML
    private RadioButton midQ1;
    @FXML
    private RadioButton sadQ1;
    @FXML
    private RadioButton happyQ2;
    @FXML
    private RadioButton midQ2;
    @FXML
    private RadioButton sadQ2;
    @FXML
    private RadioButton happyQ3;
    @FXML
    private RadioButton midQ3;
    @FXML
    private RadioButton sadQ3;


    @FXML
    public void initialize(){

    }
    private void setImagesToRadioButtons(){
        Image imageHappy = new Image(getClass().getResourceAsStream("/happy.png"));
        Image imageMid = new Image(getClass().getResourceAsStream("/mid.png"));
        Image imageSad = new Image(getClass().getResourceAsStream("/sad.png"));
    }
}
