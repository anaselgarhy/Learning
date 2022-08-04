package com.anas.learning.javafx.communicationbetweencontrollers.communicationbetweencontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstView {
    @FXML
    private TextField nameField;

    public void login(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();

        HelloView helloView = fxmlLoader.getController();
        helloView.hello(nameField.getText());

        // Switch to the new scene
        Stage stage = (Stage) nameField.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
