package com.example.pacman;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


/**
 * Klasse for å lage enheter som pacman, ghost og poeng
 */
public class enhet {

    /**
     * Lager en node objekt for enhet/Bilde, Blir brukt pacman
     */
    public Node lagEnhet(int x, int y, int w, int h, Image image) {
        ImageView enhet = new ImageView();
        enhet.setImage(image);
        enhet.setTranslateX(x);
        enhet.setTranslateY(y);
        enhet.setFitWidth(w);
        enhet.setFitHeight(h);
        HelloApplication.vinduEnheter.getChildren().add(enhet);

        return enhet;
    }

    /**
     * Lager en node objekt for enhet/Bilde, Blir brukt for ghost
     */
    public Node lagGhost(int x, int y, int w, int h, Image image) {
        ImageView enhet = new ImageView();
        enhet.setImage(image);
        enhet.setTranslateX(x);
        enhet.setTranslateY(y);
        enhet.setFitWidth(w);
        enhet.setFitHeight(h);
        HelloApplication.ghost.getChildren().add(enhet);

        return enhet;
    }

    /**
     * Lager en node objekt for poeng
     */
    public Node lagPoeng(int x, int y, boolean vis) {
        Circle poeng = new Circle();
        poeng.setCenterX(x + 17);
        poeng.setCenterY(y + 17);
        poeng.setRadius(5);
        poeng.setVisible(vis);
        poeng.setFill(Color.YELLOW);

        HelloApplication.vinduEnheter.getChildren().add(poeng);

        return poeng;
    }
}
