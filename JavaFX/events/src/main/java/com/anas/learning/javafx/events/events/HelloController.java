package com.anas.learning.javafx.events.events;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle circle;
    private double y,
            x;
    public void up(ActionEvent event) {
        System.out.println("Up");
        circle.setCenterY(y -= 10);
    }

    public void down(ActionEvent event) {
        System.out.println("Down");
        circle.setCenterY( y += 10);
    }

    public void left(ActionEvent event) {
        System.out.println("Left");
        circle.setCenterX(x -= 10);
    }

    public void right(ActionEvent event) {
        System.out.println("Right");
        circle.setCenterX(x += 10);
    }
}