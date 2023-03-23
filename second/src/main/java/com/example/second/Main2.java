package com.example.second;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text("ABCDEFGH");
        Color color = new Color(1.0,0,0,1.0);
        text.setFill(color);
        text.setX(200);
        text.setY(200);
        pane.getChildren().add(text);


        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
