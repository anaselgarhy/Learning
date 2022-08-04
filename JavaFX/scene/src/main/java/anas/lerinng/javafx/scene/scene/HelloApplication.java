package anas.lerinng.javafx.scene.scene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hi"); // Set the stage(window) title
        Group root = new Group(); // Root node of the scene graph
        // Scene object with a width of 600 and a height of 500 and a light sky blue background
        Scene scene = new Scene(root, 600, 500, Color.LIGHTSKYBLUE);
        stage.setScene(scene); // Set the scene to the stage

        Text text = new Text(); // Create a text node
        text.setText("Hello World!"); // Set the text of the text node
        text.setX(68); // Set the x coordinate of the text node
        text.setY(65); // Set the y coordinate of the text node
        text.setFont(new Font("Cairo", 60)); // Set the font of the text node
        text.setFill(Color.GOLDENROD); // Set the fill color of the text node (the color of the text)

        Line line1 = new Line(); // Create a line node
        line1.setStartX(200); // Set the start x coordinate of the line node
        line1.setStartY(200); // Set the start y coordinate of the line node
        line1.setEndX(400); // Set the end x coordinate of the line node
        line1.setEndY(400); // Set the end y coordinate of the line node
        line1.setStroke(Color.RED); // Set the stroke color of the line node
        line1.setStrokeWidth(5); // Set the stroke width of the line node

        Line line2 = new Line(400, 200, 200, 400); // Create a line node
        line2.setStroke(Color.YELLOWGREEN); // Set the stroke color of the line node
        line2.setStrokeWidth(5); // Set the stroke width of the line node

        Line line3 = new Line(60, 406, 500, 406); // Create a line node
        line3.setStroke(Color.BLUE); // Set the stroke color of the line node
        line3.setStrokeWidth(20); // Set the stroke width of the line node
        line3.setOpacity(0.5); // Set the opacity of the line node
        line3.setRotate(45); // Set to rotate of the line node (in degrees)

        Rectangle rectangle = new Rectangle(100, 100, 100, 100); // Create a rectangle node
        rectangle.setStroke(Color.TOMATO); // Set the stroke color of the rectangle node
        rectangle.setStrokeWidth(5); // Set the stroke width of the rectangle node
        rectangle.setRotate(30); // Set to rotate of the rectangle node (in degrees)

        Polygon triangle = new Polygon(); // Create a polygon node
        triangle.getPoints().addAll(
                200.0, 200.0,
                300.0, 200.0,
                300.0, 300.0
        ); // Set the points of the polygon node
        triangle.setFill(Color.GOLD); // Set the fill color of the polygon node

        Circle circle = new Circle(); // Create a circle node
        circle.setCenterX(560); // Set the center x coordinate of the circle node
        circle.setCenterY(300); // Set the center y coordinate of the circle node
        circle.setRadius(100); // Set the radius of the circle node
        circle.setFill(Color.LIGHTGREEN); // Set the fill color of the circle node

        Image pizza = new Image("file:resources/pizza.png"); // Create an image node
        ImageView imageView = new ImageView(pizza); // Create an image view node
        imageView.setX(10); // Set the x coordinate of the image view node
        imageView.setY(400); // Set the y coordinate of the image view node

        Image pizza2 = new Image("file:resources/pizza.png"); // Create an image node
        ImageView imageView2 = new ImageView(pizza2); // Create an image view node
        imageView2.setX(480); // Set the x coordinate of the image view node
        imageView2.setY(30); // Set the y coordinate of the image view node

        root.getChildren().add(text); // Add the text node to the root node
        root.getChildren().add(line1); // Add the line node to the root node
        root.getChildren().add(line2); // Add the line node to the root node
        root.getChildren().add(line3); // Add the line node to the root node
        root.getChildren().add(rectangle); // Add the rectangle node to the root node
        root.getChildren().add(triangle); // Add the polygon node to the root node
        root.getChildren().add(circle); // Add the circle node to the root node
        root.getChildren().add(imageView); // Add the image view node to the root node
        root.getChildren().add(imageView2); // Add the image view node to the root node
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}