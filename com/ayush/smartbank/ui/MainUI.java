package com.ayush.smartbank.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainUI extends Application {

    @Override
    public void start(Stage stage) {
        Label text = new Label("SmartBank UI is running");
        StackPane root = new StackPane(text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("SmartBank Dashboard");
        stage.setScene(scene);
        stage.show();

    }


}