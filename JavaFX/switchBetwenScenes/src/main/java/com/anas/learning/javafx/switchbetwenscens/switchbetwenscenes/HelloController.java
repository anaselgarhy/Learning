package com.anas.learning.javafx.switchbetwenscens.switchbetwenscenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {
    public void switchToScene2(ActionEvent actionEvent) throws IOException {
        // Load the fxml to scene2
        Parent root = new FXMLLoader(HelloController.class.getResource("scene2.fxml")).load();
        // Get the stage
        Stage stage = ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        // Set the scene
        stage.setScene(new Scene(root));
    }

    public void switchToScene1(ActionEvent actionEvent) throws IOException {
        // Load thw fxml to scene1
        Parent root = new FXMLLoader(HelloController.class.getResource("scene1.fxml")).load();
        // Get the stage
        Stage stage = ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow());
        // Set the scene
        stage.setScene(new Scene(root));
    }
}