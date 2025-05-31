package vu.oop.calcappjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Calc extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("calc.fxml"))));
            stage.setTitle("Calc App with JavaFX");
            Scene scene = new Scene(root);

            String css = this.getClass().getResource("calc.css").toExternalForm();
            scene.getStylesheets().add(css);

            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}