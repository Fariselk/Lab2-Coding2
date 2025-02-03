package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Gui2Controller {
    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Label outputLabel;

    @FXML
    private Button submitButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button exitButton;

    @FXML
    private void handleSubmit() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        outputLabel.setText("Username: " + username + "\nPassword: " + password);
    }

    @FXML
    private void handleClear() {
        usernameField.clear();
        passwordField.clear();
        outputLabel.setText("");
    }

    @FXML
    private void handleExit() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

}