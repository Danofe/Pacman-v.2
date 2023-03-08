package com.example.pacman.movement;

import javafx.scene.input.KeyCode;

import static com.example.pacman.HelloApplication.root;
import static com.example.pacman.mapLoad.karakter;

public class movement {
    public static void karakterMove() {
        root.getScene().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.W) {
                karakter.setTranslateY(karakter.getTranslateY() - 3);
                karakter.setRotate(270);
            }
            if (event.getCode() == KeyCode.S) {
                karakter.setTranslateY(karakter.getTranslateY() + 3);
                karakter.setRotate(-270);
            }
            if (event.getCode() == KeyCode.A) {
                karakter.setTranslateX(karakter.getTranslateX() - 3);
                karakter.setRotate(540);
            }
            if (event.getCode() == KeyCode.D) {
                karakter.setTranslateX(karakter.getTranslateX() + 3);
                karakter.setRotate(0);
            }
        });
    }
}