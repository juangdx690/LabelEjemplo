package com.example.labelejemplo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //así se crea un label
        Label lbl = new Label("Esto es un label");
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Ejemplo Label!");
        //se añade al panel para visualizarlo
        root.getChildren().addAll(lbl);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}