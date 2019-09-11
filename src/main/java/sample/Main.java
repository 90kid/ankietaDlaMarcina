package sample;

import view.display.StatBox;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        String  style= getClass().getResource("/buttonstyle.css").toExternalForm();
        Scene scene = new Scene(root, 300, 275);
        scene.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.S){
                StatBox.display();
            }
        });
        scene.getStylesheets().add(style);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        primaryStage.setOnCloseRequest(e -> saveFile());
        primaryStage.show();
    }

    private void saveFile(){
        SaveTXT saveTXT = new SaveTXT("Wyklad" + takeCurrentData());
        saveTXT.SaveFile();
    }

    private String takeCurrentData(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
