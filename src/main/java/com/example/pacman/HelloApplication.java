package com.example.pacman;

import com.example.pacman.collision.collision;
import com.example.pacman.movement.movement;
import com.example.pacman.ui.ui;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import static com.example.pacman.mapLoad.*;

public class HelloApplication extends Application {
    public static Pane root = new Pane();
    public static Pane vinduEnheter = new Pane();
    public static Pane uiVindu = new Pane();
    public static Pane ghost = new Pane();

    /**
     * @param stage setter stage og scene
     * @throws IOException
     * setter opp vindu og starter timer
     * timeren kjører metoder fra movement og collision klassene
     */
    @Override
    public void start(Stage stage) throws IOException {
        ui ui = new ui();
        collision collision = new collision();
        movement movement = new movement();
        ui.SelectLevelUi();
        root.getChildren().add(uiVindu);
        Scene scene = new Scene(root);
        stage.setTitle("PacMan");
        stage.setScene(scene);
        stage.show();


            AnimationTimer timer = new AnimationTimer() {
                /**
                 * @param now kjører metoder fra movement og collision klassene
                 *            hvis aktivLevel er true
                 *           aktivLevel blir true når en level er valgt
                 *            aktivLevel blir false når en level er ferdig
                 */
                @Override
                public void handle(long now) {
                    if (aktivLevel) {
                        movement.karakterMove();
                        collision.collision();
                        movement.moveGhost();
                        movement.karakterSwitch();
                    }
                }
            };
            timer.start();
}

    public static void main(String[] args) {
        launch();
    }
}