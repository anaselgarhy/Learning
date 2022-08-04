module com.anas.hellofx.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anas.hellofx.hellofx to javafx.fxml;
    exports com.anas.hellofx.hellofx;
}