package com.example.pacman.movement;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Random;

import static com.example.pacman.HelloApplication.root;
import static com.example.pacman.collision.collision.*;
import static com.example.pacman.collision.collision.clydeRetning;
import static com.example.pacman.mapLoad.*;

/**
 * Klasse for bevegelse av karakteren og ghosts
 */
public class movement {

    /**
     * Samling av alle ghost movements
     */
    public void moveGhost() {
        GhostMove(blinky, blinkyRetning);
        GhostMove(pinky, pinkyRetning);
       GhostMove(inky, inkyRetning);
       GhostMove(clyde, clydeRetning);
    }
    int retningKar;
    /**
     * Gir en ny verdi til retningKar, utifra hvilken knapp du trykker på (WASD)
     * denne brukes igjen i karakterSwitch for å bevege PacMan
     */
    public void karakterMove() {
        root.getScene().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.W) {
                karakter.setRotate(270);
                retningKar = 0;
            }
            if (event.getCode() == KeyCode.S) {
                karakter.setRotate(-270);
                retningKar = 1;
            }
            if (event.getCode() == KeyCode.A) {
                karakter.setRotate(540);
                retningKar = 2;
            }
            if (event.getCode() == KeyCode.D) {
                karakter.setRotate(0);
                retningKar = 3;
            }
        });
    }

    /**
     * Metode som tar inn et spøkelse, og retningen, og beveger den utifra retning, ved bruk av en switch
     * @param ghost Hvilket ghost som skal beveges
     * @param retning Hvilken retning den skal gå (tilfeldig fått gjennom ghostCollision metoden)
     */
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

    /**
     * En switch som beveger PacMan utifra retningen (retningKar) som blir bestemt i karakterMove
     */
    public void karakterSwitch() {
        switch(retningKar) {
            case 0:
                karakter.setTranslateY(karakter.getTranslateY()-1);
                break;
            case 1:
                karakter.setTranslateY(karakter.getTranslateY()+1);
                break;
            case 2:
                karakter.setTranslateX(karakter.getTranslateX()-1);
                break;
            case 3:
                karakter.setTranslateX(karakter.getTranslateX()+1);
                break;
        }
    }
}



