package com.example.pacman;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class spiller {

    public static Node spillerSprite(int x, int y, int w, int h, Image image) {
        ImageView spiller = new ImageView();
        spiller.setImage(image);
        spiller.setTranslateX(x);
        spiller.setTranslateY(y);
        spiller.setFitWidth(w);
        spiller.setFitHeight(h);
        HelloApplication.vinduEnheter.getChildren().add(spiller);

        return spiller;
    }


}
