package com.example.buttoneventhnd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 350, 300);

        // image
        //Image image = new Image(getClass().getResourceAsStream("accept.png"));
        // Crete button
        Button button = new Button("Button");

        button.setLayoutX(120);
        button.setLayoutY(120);

        // Add button to group
        root.getChildren().add(button);

        // drop shadow
        DropShadow dropShadow = new DropShadow();
        // Show the stage
        stage.setScene(scene);
        stage.show();

        // Show drop shadow when mouse enters button
        // The button event handler
        button.addEventHandler((MouseEvent.MOUSE_ENTERED), (event) -> {
            button.setEffect(dropShadow);
        });
        // Remove drop shadow when mouse exits button
        button.addEventHandler((MouseEvent.MOUSE_EXITED), (event) -> {
            button.setEffect(null);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}