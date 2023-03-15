package com.example.pacman;


import com.example.pacman.ui.ui;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

import static com.example.pacman.HelloApplication.*;


/**
 * Klasse for å loade map og enheter
 */
public class mapLoad {

    public static boolean aktivLevel = false;
    public static Node karakter;
    public static Node powerUp;

    public static Node blinky;
    public static Node pinky;
    public static Node inky;
    public static Node clyde;
    public static ArrayList<Node> GhostList = new ArrayList<Node>();

    public static ArrayList<Node> kartBlock = new ArrayList<Node>();

    public static ArrayList<Node> poengListe = new ArrayList<Node>();
    public static ArrayList<Node> powerList = new ArrayList<Node>();

    public static int x = 525;
    public static int y = 525;


    /**
     * Metode for å loade kart og enheter sjekker hvilken level som er aktiv og loade kartet. Den sjekker level i map.Java. Loader inn nodene i vinduet. basert på tallene i map.java
     */
    public void setKart(String[] map) {
        enhet enhet = new enhet();
        Rectangle kart = new Rectangle(x, y);
        for (int i = 0; i < map.length; i++) {
            String linje = map[i];
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
                        //Node gKloss = lagBlokk.lagBlokk(j * 35, i * 35, 35, 35, Color.RED);
                        blinky = enhet.lagGhost(j * 35, i * 35, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/blinkyGif.gif"));
                        GhostList.add(blinky);
                        break;
                    case '3':
                        //Node ggKloss = lagBlokk.lagBlokk(j * 35, i * 35, 35, 35, Color.RED);
                        pinky = enhet.lagGhost(j * 35, i * 35, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/pinkyGif.gif"));
                        GhostList.add(pinky);
                        break;
                    case '4':
                        //Node gggKloss = lagBlokk.lagBlokk(j * 35, i * 35, 35, 35, Color.RED);
                        inky = enhet.lagGhost(j * 35, i * 35, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/inkyGif.gif"));
                        GhostList.add(inky);
                        break;
                    case '5':
                        //Node ggggKloss = lagBlokk.lagBlokk(j * 35, i * 35, 35, 35, Color.RED);
                        clyde = enhet.lagGhost(j * 35, i * 35, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/clydeGif.gif"));
                        GhostList.add(clyde);
                        break;
                    case '6':
                        powerUp= enhet.lagEnhet(j * 35, i * 35, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/power.png"));
                        powerList.add(powerUp);
                        break;

                }
            }
        }
       karakter = enhet.lagEnhet(240, 240, 30, 30, new Image("file:src/main/java/com/example/pacman/assets/Kult.gif"));
        aktivLevel = true;
        ui ui = new ui();
        ui.lagUi();
        HelloApplication.root.getChildren().addAll(kart, vinduEnheter,ghost);
        HelloApplication.root.getChildren().remove(uiVindu);
    }
}
