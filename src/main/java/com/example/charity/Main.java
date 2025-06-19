package com.example.charity;  // Replace with the actual package name

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the frontpage.fxml file from resources
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/charity/frontpage.fxml"));

            // Load the root layout (StackPane in this case)
            StackPane root = loader.load();

            // Set up the scene with the root layout and set the window size
            Scene scene = new Scene(root, 800, 768);

            // Set the title of the window
            primaryStage.setTitle("Front Page");

            // Set the scene on the primary stage (main window)
            primaryStage.setScene(scene);

            // Show the window
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print any exceptions that occur during loading
        }
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}
