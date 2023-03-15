package com.example.pacman;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Klasse for å lage blokker gir en node objekt alle noder som blir laget på denne måten blir lagt til vinduEnheter og en array av nodes
 */
public class lagBlokk {

    public static Node lagBlokk(int x, int y, int w, int h, Color color) {
        Rectangle blokk = new Rectangle(w, h);
        blokk.setTranslateX(x);
        blokk.setTranslateY(y);
        blokk.setFill(color);

        HelloApplication.vinduEnheter.getChildren().add(blokk);
        return blokk;
    }
}
