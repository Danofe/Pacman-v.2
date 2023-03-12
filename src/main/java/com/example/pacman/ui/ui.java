package com.example.pacman.ui;

import com.example.pacman.HelloApplication;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class ui {
    public static int points = 0;
    public static Label poengLabel;

    public static void poeng() {
        points++;
    }


    public static void lagUi() {
        poengLabel = new Label();
        poengLabel.setTranslateX(10);
        poengLabel.setTranslateY(10);
        poengLabel.setTextFill(Color.BLACK);
        poengLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");



        HelloApplication.root.getChildren().add(poengLabel);
    }
}
