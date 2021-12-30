module com.example.buttoneventhnd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttoneventhnd to javafx.fxml;
    exports com.example.buttoneventhnd;
}