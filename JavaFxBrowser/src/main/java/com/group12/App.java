package com.group12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        // Create browser
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Load HTML page
        String htmlPage = getClass()
                .getResource("/index.html")
                .toExternalForm();

        webEngine.load(htmlPage);

        // Create buttons
        Button changeTextButton = new Button("Change Text");
        Button changeColorButton = new Button("Change Color");
        Button resetButton = new Button("Reset Page");

        // Change Text button
        changeTextButton.setOnAction(event -> {

            webEngine.executeScript(
                    "document.getElementById('title').innerText = 'Text changed by JavaFX! (click #1)';"
            );

            webEngine.executeScript(
                    "document.getElementById('message').innerText = 'This DOM update came from a Java button click.';"
            );
        });

        // Change Color button
        changeColorButton.setOnAction(event -> {

            webEngine.executeScript(
                    "document.getElementById('title').style.color = '#e63946';"
            );
        });

        // Reset Page button
        resetButton.setOnAction(event -> {

            webEngine.executeScript(
                    "document.getElementById('title').innerText = 'Hello, this is the original text!';"
            );

            webEngine.executeScript(
                    "document.getElementById('message').innerText = 'Waiting for JavaFX to make a change...';"
            );

            webEngine.executeScript(
                    "document.getElementById('title').style.color = 'black';"
            );

            webEngine.executeScript(
                    "document.getElementById('message').style.color = '#666666';"
            );
        });

        // Create button bar
        HBox buttonBar = new HBox(15);
        buttonBar.setStyle("-fx-alignment: center; -fx-padding: 15;");

        buttonBar.getChildren().addAll(
                changeTextButton,
                changeColorButton,
                resetButton
        );

        // Main layout
        BorderPane root = new BorderPane();
        root.setCenter(webView);
        root.setBottom(buttonBar);

        // Create scene
        Scene scene = new Scene(root, 1000, 700);

        stage.setTitle("CSC360 Group 12 - JavaFX WebView DOM Controller");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}