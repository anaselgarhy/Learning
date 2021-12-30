package com.example.text;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);

        Text text = new Text("Anas");
        // Set x and y foer text
        text.setLayoutX(300);
        text.setLayoutY(300);

        // add
        root.getChildren().add(text);

        // Font
        Font font = new Font("century gothic", 50);

        // Ste font for text
        text.setFont(font);

        // Set color of text
        text.setFill(Color.BLUEVIOLET);

        // Shadow
        DropShadow shadow = new DropShadow(10, 4, 4, Color.BLACK);
        // Set text shadow
        text.setEffect(shadow);

        // Reflection effect
        Reflection ref = new Reflection();
        ref.setFraction(0.8);
        // Add to text
        text.setEffect(ref);

        // Rotate text
        new Thread(() -> {
            int d = 0;
            while (true){
                text.setRotate(d);
                d = (d == 350)? 0 : d + 10;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Set stage title
        stage.setTitle("Text");
        //
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}