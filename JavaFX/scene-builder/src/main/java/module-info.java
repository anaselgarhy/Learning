module com.anas.learning.javafx.scenebuilder.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anas.learning.javafx.scenebuilder.scenebuilder to javafx.fxml;
    exports com.anas.learning.javafx.scenebuilder.scenebuilder;
}