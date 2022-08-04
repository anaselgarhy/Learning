package com.anas.learning.javafx.communicationbetweencontrollers.communicationbetweencontrollers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloView {
    @FXML
    private Label helloLabel;

    public void hello(String name) {
        helloLabel.setText("Hello, " + name);
    }
}
