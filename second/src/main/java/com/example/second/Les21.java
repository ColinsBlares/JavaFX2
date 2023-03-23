package com.example.second;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Les21 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text("ABC");
        pane.getChildren().add(text);
        text.setX(200);
        text.setY(200);

        text.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.DOWN)
                    text.setY(text.getY() + 10);
                else if (keyEvent.getCode() == KeyCode.UP)
                    text.setY(text.getY() - 10);
                else if (keyEvent.getCode() == KeyCode.LEFT)
                    text.setX(text.getX() - 10);
                else if (keyEvent.getCode() == KeyCode.RIGHT)
                    text.setX(text.getX() + 10);
            }
        });

        Scene scene = new Scene(pane, 400,400);
        stage.setScene(scene);
        stage.show();
        text.requestFocus();
    }
}
