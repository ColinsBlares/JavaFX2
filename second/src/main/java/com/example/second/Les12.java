package com.example.second;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;

public class Les12 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("src/VK.png"));
        ImageView imageView = new ImageView(image);
        pane.getChildren().add(imageView);
        Line line = new Line(100,200,300,200);

        PathTransition transition = new PathTransition(Duration.millis(10000), line, imageView);
        transition.setCycleCount(3);
        transition.play();

        Scene scene = new Scene(pane, 400,400);
        stage.setScene(scene);
        stage.show();
    }
}
