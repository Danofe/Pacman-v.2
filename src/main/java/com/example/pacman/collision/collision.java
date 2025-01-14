package com.example.pacman.collision;

import com.example.pacman.ui.ui;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import static com.example.pacman.HelloApplication.vinduEnheter;
import static com.example.pacman.mapLoad.*;

/**
 * Klasse for collision metoder
 */
public class collision {
    ui ui = new ui();
    public static int pinkyRetning;
    public static int blinkyRetning;
    public static int inkyRetning;
    public static int clydeRetning;


    /**
     * samling av metodene
     */
     public void collision() {
        karakterCollision();
        poengCollision();
        ghostCollisionV2(blinky);
        ghostCollisionV(pinky);
        ghostCollisionV3(inky);
        ghostCollisionV4(clyde);
        karakterDod();
        powerUpActive();
    }

    /**
     * collision mellom karakter og vegger
     */
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

    /**
     * collision mellom karakter og poeng
     */
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

    /**
     * @param ghost Hvilket spøkelse som skal sjekkes
     * Metode for å sjekke collision mellom spøkelse og vegger og bytte retning
     * samme med V2, V3 og V4
     */
    public void ghostCollisionV(Node ghost) {
        for (Node Kloss : kartBlock) {
            if (ghost.getBoundsInParent().intersects(Kloss.getBoundsInParent())) {
                if (ghost.getTranslateX() < Kloss.getTranslateX()) {
                    ghost.setTranslateX(ghost.getTranslateX() - 3);
                    pinkyRetning = (int)(Math.random()*4);
                    if(pinkyRetning == 0) {
                        pinkyRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateX() > Kloss.getTranslateX()) {
                    ghost.setTranslateX(ghost.getTranslateX() + 3);
                    pinkyRetning = (int)(Math.random()*4);
                    if(pinkyRetning == 1) {
                       pinkyRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateY() < Kloss.getTranslateY()) {
                    ghost.setTranslateY(ghost.getTranslateY() - 3);
                    pinkyRetning = (int)(Math.random()*4);
                    if(pinkyRetning == 2) {
                        pinkyRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateY() > Kloss.getTranslateY()) {
                    ghost.setTranslateY(ghost.getTranslateY() + 2);
                    pinkyRetning = (int)(Math.random()*4);
                    if(pinkyRetning == 3) {
                        pinkyRetning = (int)(Math.random()*4);
                    }
                }
            }
        }
    }

    public void ghostCollisionV2(Node ghost) {
             for (Node Kloss : kartBlock) {
                 if (ghost.getBoundsInParent().intersects(Kloss.getBoundsInParent())) {
                     if (ghost.getTranslateX() < Kloss.getTranslateX()) {
                         ghost.setTranslateX(ghost.getTranslateX() - 3);
                         blinkyRetning = (int) (Math.random() * 4);
                         if (blinkyRetning == 0) {
                             blinkyRetning = (int) (Math.random() * 4);
                         }
                     }
                     if (ghost.getTranslateX() > Kloss.getTranslateX()) {
                         ghost.setTranslateX(ghost.getTranslateX() + 3);
                         blinkyRetning = (int) (Math.random() * 4);
                         if (blinkyRetning == 1) {
                             blinkyRetning = (int) (Math.random() * 4);
                         }
                     }
                     if (ghost.getTranslateY() < Kloss.getTranslateY()) {
                         ghost.setTranslateY(ghost.getTranslateY() - 3);
                         blinkyRetning = (int) (Math.random() * 4);
                         if (blinkyRetning == 2) {
                             blinkyRetning = (int) (Math.random() * 4);
                         }
                     }
                     if (ghost.getTranslateY() > Kloss.getTranslateY()) {
                         ghost.setTranslateY(ghost.getTranslateY() + 2);
                         blinkyRetning = (int) (Math.random() * 4);
                         if (blinkyRetning == 3) {
                             blinkyRetning = (int) (Math.random() * 4);
                         }
                     }
                 }
             }
    }

    public void ghostCollisionV3(Node ghost) {
        for (Node Kloss : kartBlock) {
            if (ghost.getBoundsInParent().intersects(Kloss.getBoundsInParent())) {
                if (ghost.getTranslateX() < Kloss.getTranslateX()) {
                    ghost.setTranslateX(ghost.getTranslateX() - 3);
                    inkyRetning = (int)(Math.random()*4);
                    if(inkyRetning == 0) {
                        inkyRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateX() > Kloss.getTranslateX()) {
                    ghost.setTranslateX(ghost.getTranslateX() + 3);
                    inkyRetning = (int)(Math.random()*4);
                    if(inkyRetning == 1) {
                        inkyRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateY() < Kloss.getTranslateY()) {
                    ghost.setTranslateY(ghost.getTranslateY() - 3);
                    inkyRetning = (int)(Math.random()*4);
                    if(inkyRetning == 2) {
                        inkyRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateY() > Kloss.getTranslateY()) {
                    ghost.setTranslateY(ghost.getTranslateY() + 2);
                    inkyRetning = (int)(Math.random()*4);
                    if(inkyRetning == 3) {
                        inkyRetning = (int)(Math.random()*4);
                    }
                }
            }
        }
    }

    public void ghostCollisionV4(Node ghost) {
        for (Node Kloss : kartBlock) {
            if (ghost.getBoundsInParent().intersects(Kloss.getBoundsInParent())) {
                if (ghost.getTranslateX() < Kloss.getTranslateX()) {
                    ghost.setTranslateX(ghost.getTranslateX() - 3);
                    clydeRetning = (int)(Math.random()*4);
                    if(clydeRetning == 0) {
                        clydeRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateX() > Kloss.getTranslateX()) {
                    ghost.setTranslateX(ghost.getTranslateX() + 3);
                    clydeRetning = (int)(Math.random()*4);
                    if(clydeRetning == 1) {
                        clydeRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateY() < Kloss.getTranslateY()) {
                    ghost.setTranslateY(ghost.getTranslateY() - 3);
                    clydeRetning = (int)(Math.random()*4);
                    if(clydeRetning == 2) {
                        clydeRetning = (int)(Math.random()*4);
                    }
                }
                if (ghost.getTranslateY() > Kloss.getTranslateY()) {
                    ghost.setTranslateY(ghost.getTranslateY() + 2);
                    clydeRetning = (int)(Math.random()*4);
                    if(clydeRetning == 3) {
                        clydeRetning = (int)(Math.random()*4);
                    }
                }
            }
        }
    }

    /**
     * Metode som sjekker om karakteren kolliderer med spøkelse og dør
     * ingen ting skjer bare en melding i konsollen
     */
    public void karakterDod() {
        try {
            for (Node Ghost : GhostList) {
                if (karakter.getBoundsInParent().intersects(Ghost.getBoundsInParent())) {
                    System.out.println("Du døde");
                }
            }
        } catch (Exception e) {

        }
    }

    /**
     * Metode som sjekker om karakteren kolliderer med powerup og fjerner den fra listen
     */
    public void powerUpActive() {
        try {
        for (Node power : powerList) {
            if (karakter.getBoundsInParent().intersects(power.getBoundsInParent())) {
                power.setVisible(false);
                powerList.remove(power);
            }

        }
            } catch (Exception e) {
        }
     }
}

