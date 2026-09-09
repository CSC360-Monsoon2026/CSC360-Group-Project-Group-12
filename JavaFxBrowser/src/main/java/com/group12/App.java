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

        // Create JavaFX button
        Button changeButton = new Button("Change DOM");

        // Button action
        changeButton.setOnAction(event -> {

            // Change heading text
            webEngine.executeScript(
                    "document.getElementById('title').innerText = 'DOM Changed by JavaFX!';"
            );

            // Change paragraph text
            webEngine.executeScript(
                    "document.getElementById('message').innerText = 'JavaFX successfully changed the browser DOM.';"
            );

            // Change heading color
            webEngine.executeScript(
                    "document.getElementById('title').style.color = 'blue';"
            );

            // Change paragraph color
            webEngine.executeScript(
                    "document.getElementById('message').style.color = 'green';"
            );
        });

        // Top bar
        HBox topBar = new HBox(10);
        topBar.getChildren().add(changeButton);

        // Main layout
        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(webView);

        // Create scene
        Scene scene = new Scene(root, 1000, 700);

        stage.setTitle("JavaFX Browser - DOM Manipulation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}