package com.example.charity;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainPageController {

    @FXML
    private Button donorButton;

    @FXML
    private Button orgButton;

    @FXML
    private void handleDonorButtonAction(ActionEvent event) {
        Stage donorStage = new Stage();

        try {
            Scene donorScene = new Scene(FXMLLoader.load(Objects.requireNonNull(MainPageController.class.getResource("donorlogin.fxml"))));
            donorStage.setScene(donorScene);
            donorStage.setTitle("Donor Login");
            donorStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleOrgButtonAction(ActionEvent event) {
        Stage orgStage = new Stage();

        try {
            Scene orgScene = new Scene(FXMLLoader.load(Objects.requireNonNull(MainPageController.class.getResource("volunteer.fxml"))));
            orgStage.setScene(orgScene);
            orgStage.setTitle("Volunteer Login");
            orgStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

