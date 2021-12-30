module com.example.text {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.text to javafx.fxml;
    exports com.example.text;
}