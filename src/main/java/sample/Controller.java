package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

    private Question question1;
    private Question question2;
    private Question question3;


    @FXML
    public void initialize(){
        setImagesToRadioButtons();
        question1 = new Question("Jak oceniasz grę szkoleniową?");
        question2 = new Question("Jak oceniasz prelekcję?");
        question3 = new Question("Jak oceniasz organizację konferencji?");
    }

    public void handelAcceptationButton(){
        addPoints();
        AlertBox.display();
    }

    private void setImagesToRadioButtons(){
        setAllHappyRadioButtons();
        setAllMidRadioButtons();
        setAllSadRadioButtons();
    }
    private void setAllHappyRadioButtons(){
        Image imageHappy = new Image(getClass().getResourceAsStream("/happy.png"));
        happyQ1.getStyleClass().remove("radio-button");
        happyQ1.getStyleClass().add("toggle-button");
        happyQ1.setStyle("-fx-background-color: transparent;");
        happyQ1.setGraphic(new ImageView(imageHappy));
        happyQ2.getStyleClass().remove("radio-button");
        happyQ2.getStyleClass().add("toggle-button");
        happyQ2.setStyle("-fx-background-color: transparent;");
        happyQ2.setGraphic(new ImageView(imageHappy));
        happyQ3.getStyleClass().remove("radio-button");
        happyQ3.getStyleClass().add("toggle-button");
        happyQ3.setStyle("-fx-background-color: transparent;");
        happyQ3.setGraphic(new ImageView(imageHappy));
    }
    private void setAllMidRadioButtons(){
        Image imageMid = new Image(getClass().getResourceAsStream("/mid.png"));
        midQ1.getStyleClass().remove("radio-button");
        midQ1.getStyleClass().add("toggle-button");
        midQ1.setStyle("-fx-background-color: transparent;");
        midQ1.setGraphic(new ImageView(imageMid));
        midQ2.getStyleClass().remove("radio-button");
        midQ2.getStyleClass().add("toggle-button");
        midQ2.setStyle("-fx-background-color: transparent;");
        midQ2.setGraphic(new ImageView(imageMid));
        midQ3.getStyleClass().remove("radio-button");
        midQ3.getStyleClass().add("toggle-button");
        midQ3.setStyle("-fx-background-color: transparent;");
        midQ3.setGraphic(new ImageView(imageMid));
    }
    private void setAllSadRadioButtons(){
        Image imageSad = new Image(getClass().getResourceAsStream("/sad.png"));
        sadQ1.getStyleClass().remove("radio-button");
        sadQ1.getStyleClass().add("toggle-button");
        sadQ1.setStyle("-fx-background-color: transparent;");
        sadQ1.setGraphic(new ImageView(imageSad));
        sadQ2.getStyleClass().remove("radio-button");
        sadQ2.getStyleClass().add("toggle-button");
        sadQ2.setStyle("-fx-background-color: transparent;");
        sadQ2.setGraphic(new ImageView(imageSad));
        sadQ3.getStyleClass().remove("radio-button");
        sadQ3.getStyleClass().add("toggle-button");
        sadQ3.setStyle("-fx-background-color: transparent;");
        sadQ3.setGraphic(new ImageView(imageSad));
    }
    private void addPoints(){
        questionSelect(happyQ1, midQ1, sadQ1, question1);
        questionSelect(happyQ2, midQ2, sadQ2, question2);
        questionSelect(happyQ3, midQ3, sadQ3, question3);
    }

    private void questionSelect(RadioButton happyButton, RadioButton midButton,RadioButton sadButton,Question question){
        if(happyButton.isSelected()){
            question.incrementHappy();
        }
        else if (midButton.isSelected()){
            question.incrementMid();
        }
        else if (sadButton.isSelected()){
            question.incrementSad();
        }
    }
}
