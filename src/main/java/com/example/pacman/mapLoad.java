package com.example.pacman;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static com.example.pacman.HelloApplication.vinduEnheter;

public class mapLoad {

    public static Node karakter;


    public static void setKart() {
        Rectangle kart = new Rectangle(1260, 840);
        for (int i = 0; i < Map.KART.length; i++) {
            String linje = Map.KART[i];
            for (int j = 0; j < linje.length(); j++) {
                switch (linje.charAt(j)) {
                    case '0':
                        break;
                    case '1':
                        Node kloss = lagBlokk.lagBlokk(j * 35, i * 35, 35, 35, Color.BLUE);
                        HelloApplication.kartBlock.add(kloss);
                        break;
                }
            }
        }
       karakter = spiller.spillerSprite(240, 240, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/Kult.gif"));

        HelloApplication.root.getChildren().addAll(kart, vinduEnheter);
    }



}
