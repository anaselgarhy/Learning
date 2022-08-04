module anas.lerinng.javafx.scene.scene {
    requires javafx.controls;
    requires javafx.fxml;


    opens anas.lerinng.javafx.scene.scene to javafx.fxml;
    exports anas.lerinng.javafx.scene.scene;
}