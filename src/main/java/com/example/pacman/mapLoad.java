package com.example.pacman;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

import static com.example.pacman.HelloApplication.vinduEnheter;

public class mapLoad {

    public static Node karakter;

    public static Node Ghost;
    public static ArrayList<Node> GhostList = new ArrayList<Node>();

    public static ArrayList<Node> kartBlock = new ArrayList<Node>();

    public static ArrayList<Node> poengListe = new ArrayList<Node>();


    public static void setKart() {
        Rectangle kart = new Rectangle(1190, 840);
        for (int i = 0; i < Map.KART.length; i++) {
            String linje = Map.KART[i];
            for (int j = 0; j < linje.length(); j++) {
                switch (linje.charAt(j)) {
                    case '0':
                        Node poeng = enhet.lagPoeng(j * 35, i * 35 , true);
                        poengListe.add(poeng);
                        break;
                    case '1':
                        Node kloss = lagBlokk.lagBlokk(j * 35, i * 35, 35, 35, Color.BLUE);
                        kartBlock.add(kloss);
                        break;
                    case '2':
                        Node gKloss = lagBlokk.lagBlokk(j * 35, i * 35, 35, 35, Color.RED);
                        enhet.lagEnhet(j * 35, i * 35, 35, 35, new Image("file:src/main/java/com/example/pacman/assets/ghost-pacman.gif"));
                        GhostList.add(Ghost);
                        break;
                }
            }
        }
       karakter = enhet.lagEnhet(240, 240, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/Kult.gif"));


        HelloApplication.root.getChildren().addAll(kart, vinduEnheter);
    }



}
