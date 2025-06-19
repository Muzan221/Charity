package com.example.charity; // Replace with your actual package name

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class frontpagecontroller {

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        Stage mainPageStage = new Stage();

        try {
            Scene mainPageScene = new Scene(FXMLLoader.load(Objects.requireNonNull(frontpagecontroller.class.getResource("mainpage.fxml"))));
            mainPageStage.setScene(mainPageScene);
            mainPageStage.setTitle("Main Page");
            mainPageStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
