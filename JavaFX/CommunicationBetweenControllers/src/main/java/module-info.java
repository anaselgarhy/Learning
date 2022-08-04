module com.anas.learning.javafx.communicationbetweencontrollers.communicationbetweencontrollers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anas.learning.javafx.communicationbetweencontrollers.communicationbetweencontrollers to javafx.fxml;
    exports com.anas.learning.javafx.communicationbetweencontrollers.communicationbetweencontrollers;
}