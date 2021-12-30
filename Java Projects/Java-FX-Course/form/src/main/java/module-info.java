module com.example.form {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.form to javafx.fxml;
    exports com.example.form;
}