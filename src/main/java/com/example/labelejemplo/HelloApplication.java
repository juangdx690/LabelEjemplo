package com.example.labelejemplo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    EventHandler<MouseEvent> cierra = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            System.exit(0);
        }
    };

    @Override
    public void start(Stage stage) throws IOException {
        //así se crea un label
        Label lbl = new Label("Esto es un label");
        lbl.addEventHandler(MouseEvent.MOUSE_CLICKED, cierra);
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