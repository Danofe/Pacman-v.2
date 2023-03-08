package com.example.pacman.collision;

import com.example.pacman.ui.ui;
import javafx.scene.Node;

import static com.example.pacman.mapLoad.*;

public class collision {

    public static void collision() {
        karakterCollision();
        poengCollision();
    }
    public static void karakterCollision() {
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
    public static void poengCollision() {
        for (Node poeng : poengListe) {
            if (karakter.getBoundsInParent().intersects(poeng.getBoundsInParent())) {
                poeng.setVisible(false);
                ui.poeng();
                ui.poengLabel.setText("Poeng: " + ui.points);
            }
        }

    }
}
