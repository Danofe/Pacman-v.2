package com.example.pacman;

import com.example.pacman.collision.collision;
import com.example.pacman.movement.movement;
import com.example.pacman.ui.ui;
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
    public static Pane root = new Pane();
    static Pane vinduEnheter = new Pane();
    static Pane uiVindu = new Pane();

    @Override
    public void start(Stage stage) throws IOException {
        mapLoad kart = new mapLoad();
        ui ui = new ui();
        collision collision = new collision();
        movement movement = new movement();
        kart.setKart();
        ui.lagUi();

        Scene scene = new Scene(root);
        stage.setTitle("PacMan");
        stage.setScene(scene);
        stage.show();

        AnimationTimer timer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                movement.karakterMove();
                collision.collision();
                movement.ghostMove();
            }
        };
        timer.start();
    }

    public static void main(String[] args) {
        launch();
    }
}