module com.example.javafxcourse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxcourse to javafx.fxml;
    exports com.example.javafxcourse;
}