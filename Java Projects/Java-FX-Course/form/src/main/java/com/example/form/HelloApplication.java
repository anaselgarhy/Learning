package com.example.form;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        // Create scene
        Scene scene = new Scene(group, 300, 250, Color.BLANCHEDALMOND);

        // Create label name
        Label labelName = new Label("Name:");
        // Create label email
        Label labelEmail = new Label("Email:");

        // Set x and y for label name
        labelName.setLayoutX(60);
        labelName.setLayoutY(10);

        // Add label name to group
        group.getChildren().add(labelName);

        // Set x and y for label email
        labelEmail.setLayoutX(60);
        labelEmail.setLayoutY(40);

        // Add label email to group
        group.getChildren().add(labelEmail);

        // Create text fields
        TextField name = new TextField();
        TextField email = new TextField();

        // Set x and y for name text field
        name.setLayoutX(100);
        name.setLayoutY(10);

        // Set x and y for email text field
        email.setLayoutX(100);
        email.setLayoutY(40);

        // Add name text field to group
        group.getChildren().add(name);

        // Add email text field to group
        group.getChildren().add(email);

        // Create submit button
        Button submit = new Button("Submit");
        // Set x and y for submit button
        submit.setLayoutX(120);
        submit.setLayoutY(68);

        // Add submit button to group
        group.getChildren().add(submit);

        // Create label
        Label label = new Label();
        // Set x and y for label
        label.setLayoutX(60);
        label.setLayoutY(95);
        // Add label to group
        group.getChildren().add(label);

        // Set scene
        stage.setScene(scene);
        // Set stage title
        stage.setTitle("Form");
        // Show stage
        stage.show();

        // Button submit event
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText("Hi, " + name.getText() + ", Your email is: " + email.getText());
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}