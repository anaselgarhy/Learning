package com.anas.hellofx.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group(); // Root node of the scene graph
        Scene scene = new Scene(root); // Scene object
        stage.setScene(scene); // Set the scene to the stage
        stage.setTitle("Demo javaFX"); // Set the stage(window) title
        stage.setWidth(420); // Set the stage(window) width
        stage.setHeight(420); // Set the stage(window) height
        stage.setResizable(false); // Set the stage(window) resizable property to false
        stage.setFullScreen(true); // Set the stage(window) full screen property to true
        stage.setFullScreenExitHint("Pres a key to exit full screen"); // Set the stage(window) full screen exit hint
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("A")); // Set the stage(window) full screen exit key combination to A
        stage.setOnCloseRequest(event -> System.out.println("NO :P")); // Set the stage(window) close event handler
        stage.setAlwaysOnTop(true); // Set the stage(window) always on top property to true
        stage.show(); // Show the stage (make it visible)
    }

    public static void main(String[] args) {
        launch(); // Launch the JavaFX application
    }
}