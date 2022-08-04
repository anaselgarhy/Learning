module com.anas.learning.javafx.events.events {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anas.learning.javafx.events.events to javafx.fxml;
    exports com.anas.learning.javafx.events.events;
}