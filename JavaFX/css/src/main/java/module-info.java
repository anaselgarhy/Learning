module com.anas.learning.javafx.css.css {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anas.learning.javafx.css.css to javafx.fxml;
    exports com.anas.learning.javafx.css.css;
}