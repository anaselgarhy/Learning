module com.anas.learning.javafx.switchbetwenscens.switchbetwenscenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anas.learning.javafx.switchbetwenscens.switchbetwenscenes to javafx.fxml;
    exports com.anas.learning.javafx.switchbetwenscens.switchbetwenscenes;
}