package com.example.pacman.movement;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Random;

import static com.example.pacman.HelloApplication.root;
import static com.example.pacman.mapLoad.*;

public class movement {


    public void karakterMove() {
        int x = (int) karakter.getTranslateX();
        int y = (int) karakter.getTranslateY();

        root.getScene().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.W) {
                karakter.setTranslateY(y - 3);
                karakter.setRotate(270);
            }
            if (event.getCode() == KeyCode.S) {
                karakter.setTranslateY(y + 3);
                karakter.setRotate(-270);
            }
            if (event.getCode() == KeyCode.A) {
                karakter.setTranslateX(x - 3);
                karakter.setRotate(540);
            }
            if (event.getCode() == KeyCode.D) {
                karakter.setTranslateX(x + 3);
                karakter.setRotate(0);
            }
        });
    }
    public void GhostMove(Node ghost, int retning) {
        switch(retning) {
            case 0 :
                ghost.setTranslateX(ghost.getTranslateX()-1);
                break;
            case 1:
                ghost.setTranslateX(ghost.getTranslateX()+1);
                break;
            case 2:
                ghost.setTranslateY(ghost.getTranslateY()+1);
                break;
            case 3:
                ghost.setTranslateY(ghost.getTranslateY()-1);
                break;
        }
    }
}



