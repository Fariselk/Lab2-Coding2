package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class gui3Controller {

    @FXML
    private void handleNew() {
        // Handle new action
    }

    @FXML
    private void handleOpenFile() {
        // Handle open file action
    }

    @FXML
    private void handleExit(ActionEvent event) {
        Stage stage = (Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow();
        stage.close();
    }
}