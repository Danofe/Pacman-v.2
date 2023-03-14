package com.example.pacman.collision;

import com.example.pacman.ui.ui;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import static com.example.pacman.HelloApplication.vinduEnheter;
import static com.example.pacman.mapLoad.*;

public class collision {
    ui ui = new ui();

     public void collision() {
        karakterCollision();
        poengCollision();
        ghostCollisionV();
        karakterDød();
    }
    public void karakterCollision() {
        for (Node kloss : kartBlock) {
            if (karakter.getBoundsInParent().intersects(kloss.getBoundsInParent())) {
                if (karakter.getTranslateX() < kloss.getTranslateX()) {
                    karakter.setTranslateX(karakter.getTranslateX() - 3);
                }
                if (karakter.getTranslateX() > kloss.getTranslateX()) {
                    karakter.setTranslateX(karakter.getTranslateX() + 3);
                }
                if (karakter.getTranslateY() < kloss.getTranslateY()) {
                    karakter.setTranslateY(karakter.getTranslateY() - 3);
                }
                if (karakter.getTranslateY() > kloss.getTranslateY()) {
                    karakter.setTranslateY(karakter.getTranslateY() + 2);
                }
            }
        }
    }
    public void poengCollision() {
         try {
             for (Node poeng : poengListe) {
                if (karakter.getBoundsInParent().intersects(poeng.getBoundsInParent())) {

                ui.points++;
                poeng.setVisible(false);
                poengListe.remove(poeng);
                ui.poengLabel.setText("Poeng: " + ui.points);
                }
            }
        } catch (Exception e) {

        }
     }
public void ghostCollisionV() {
    for (Node Ghost : GhostList) {
        for (Node Kloss : kartBlock) {
            if (Ghost.getBoundsInParent().intersects(Kloss.getBoundsInParent())) {
                if (Ghost.getTranslateX() < Kloss.getTranslateX()) {
                    Ghost.setTranslateX(Ghost.getTranslateX() - 3);
                    }
                if (Ghost.getTranslateX() > Kloss.getTranslateX()) {
                    Ghost.setTranslateX(Ghost.getTranslateX() + 3);
                    }
                if (Ghost.getTranslateY() < Kloss.getTranslateY()) {
                    Ghost.setTranslateY(Ghost.getTranslateY() - 3);
                    }
                if (Ghost.getTranslateY() > Kloss.getTranslateY()) {
                    Ghost.setTranslateY(Ghost.getTranslateY() + 2);
                    }
                }
            }
        }
    }

    public void karakterDød() {
        for (Node Ghost : GhostList) {
            if (karakter.getBoundsInParent().intersects(Ghost.getBoundsInParent())) {


            }
        }
    }
}

