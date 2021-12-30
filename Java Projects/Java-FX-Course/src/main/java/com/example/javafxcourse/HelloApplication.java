package com.example.javafxcourse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 700, 700, Color.BLACK);

        Button button = new Button();
        button.setLayoutX(250);
        button.setLayoutY(250);
        button.setText("Click me");
        // Add button to group
        group.getChildren().add(button);

        stage.setScene(scene);
        // Set title
        stage.setTitle("JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}