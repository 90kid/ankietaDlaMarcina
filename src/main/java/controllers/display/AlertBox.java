package controllers.display;

import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class AlertBox {
    public static void display(){

        try {
            PauseTransition delay = new PauseTransition(Duration.seconds(1));
            FXMLLoader fxmlLoader = new FXMLLoader(AlertBox.class.getResource("/AlertBox.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            delay.setOnFinished( event -> stage.close() );
            delay.play();
            stage.setScene(new Scene(root1));
            stage.setMaximized(true);
            stage.setResizable(false);
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch (IOException e) {
            System.err.println("Nie mozna otworzyc okna");
        }
    }
}
