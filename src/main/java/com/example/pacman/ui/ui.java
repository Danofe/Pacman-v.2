package com.example.pacman.ui;

import com.example.pacman.HelloApplication;
import javafx.scene.control.Label;



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


        HelloApplication.root.getChildren().add(poengLabel);
    }
}
