package controllers.display;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class StatBox {
    public static void display(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(StatBox.class.getResource("/StatBox.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch (IOException e) {
            System.out.println("Nie mozna otworzyc okna");
        }
    }
}