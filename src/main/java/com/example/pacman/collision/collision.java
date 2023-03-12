package com.example.pacman.collision;

import com.example.pacman.ui.ui;
import javafx.scene.Node;

import static com.example.pacman.mapLoad.*;

public class collision {

     public void collision() {
        karakterCollision();
        poengCollision();
        ghostCollisionV();
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
        for (Node poeng : poengListe) {
            if (karakter.getBoundsInParent().intersects(poeng.getBoundsInParent())) {

                ui.points++;
                poeng.setVisible(false);
                poengListe.remove(poeng);
                ui.poengLabel.setText("Poeng: " + ui.points);
            }
        }
    }

public void ghostCollisionV() {
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

