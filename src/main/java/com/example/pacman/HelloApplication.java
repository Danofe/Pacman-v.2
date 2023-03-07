package com.example.pacman;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static com.example.pacman.mapLoad.karakter;

public class HelloApplication extends Application {
    private int høyde;
    public static Pane root = new Pane();
    public static Pane vinduEnheter = new Pane();
    public static ArrayList<Node> kartBlock = new ArrayList<Node>();


    public void bevegeslse() {
        root.getScene().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.W) {
                karakter.setTranslateY(karakter.getTranslateY() - 3);
                karakter.setRotate(270);
            }
            if (event.getCode() == KeyCode.S) {
                karakter.setTranslateY(karakter.getTranslateY() + 3);
                karakter.setRotate(-270);
            }
            if (event.getCode() == KeyCode.A) {
                karakter.setTranslateX(karakter.getTranslateX() - 3);
                karakter.setRotate(540);
            }
            if (event.getCode() == KeyCode.D) {
                karakter.setTranslateX(karakter.getTranslateX() + 3);
                karakter.setRotate(0);
            }
        });
    }


    private void update() {
        for (Node kloss : kartBlock) {
            if (karakter.getBoundsInParent().intersects(kloss.getBoundsInParent())) {
                if (karakter.getTranslateX() < kloss.getTranslateX()) {
                    karakter.setTranslateX(karakter.getTranslateX() - 3);
                }
                if (karakter.getTranslateX() > kloss.getTranslateX()) {
                    karakter.setTranslateX(karakter.getTranslateX() + 3);
                }
                if (karakter.getTranslateY() < kloss.getTranslateY()) {
                    karakter.setTranslateY(karakter.getTranslateY() - 2);
                }
                if (karakter.getTranslateY() > kloss.getTranslateY()) {
                    karakter.setTranslateY(karakter.getTranslateY() + 2);
                }
            }
        }
    }


    @Override
    public void start(Stage stage) throws IOException {
        mapLoad.setKart();

        Scene scene = new Scene(root);
        stage.setTitle("PacMan");
        stage.setScene(scene);
        stage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                bevegeslse();
                update();
            }
        };
        timer.start();
    }

    public static void main(String[] args) {
        launch();
    }
}