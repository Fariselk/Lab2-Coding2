package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class gui4Controller {

    @FXML
    private Circle circle;

    @FXML
    private void handleEnlarge() {
        circle.setRadius(circle.getRadius() + 10);
    }

    @FXML
    private void handleShrink() {
        circle.setRadius(circle.getRadius() - 10);
    }
}