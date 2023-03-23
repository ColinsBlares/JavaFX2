package com.example.second;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Stack;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle circle = new Circle(50);
//        circle.setCenterX(100);
//        circle.setCenterY(100);
        circle.setFill(Color.BLUE);
//        circle.setStroke(Color.RED);
//        circle.setStrokeWidth(20);

        Text text = new Text("ABC");
//        text.setX(200);
//        text.setY(200);
        text.setStyle("-fx-fill: #8D008B;  -fx-font-weight: bold; -fx-font-size:20px;" +
                "-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);"+
                "-fx-font-style: ITALIC");

        Rectangle rectangle = new Rectangle(100, 100, 100, 100);

//        FlowPane pane = new FlowPane();
//        pane.setOrientation(Orientation.VERTICAL);
//        pane.getChildren().add(circle);
//        pane.getChildren().add(text);
//        pane.getChildren().add(rectangle);

//        GridPane gridPane = new GridPane();
//        gridPane.add(circle, 0, 0);
//        gridPane.add(text,1,0);
//        gridPane.add(rectangle, 0,1);

        BorderPane borderPane = new BorderPane();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);
        stackPane.getChildren().add(text);

        borderPane.setLeft(stackPane);

        Scene scene = new Scene(borderPane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}