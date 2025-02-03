package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField name;

    @FXML
    private TextField password;

    @FXML
    private Button button;

    @FXML
    private void initialize() {
        button.setOnAction(event -> showAlert());
    }

    @FXML
    private void showAlert() {
        String username = this.name.getText();
        String password = this.password.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Information");
        alert.setContentText("Username: " + username + "\nPassword: " + password);
        alert.showAndWait();
    }
}