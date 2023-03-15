package com.example.pacman.ui;

import com.example.pacman.HelloApplication;
import com.example.pacman.mapLoad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static com.example.pacman.Map.*;
import static com.example.pacman.mapLoad.*;


public class ui {
    public static int points = 0;
    public static Label poengLabel;

    public void poeng() {
        points++;
    }


    public void lagUi() {
        poengLabel = new Label();
        poengLabel.setTranslateX(10);
        poengLabel.setTranslateY(10);
        poengLabel.setTextFill(Color.BLACK);
        poengLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");

        HelloApplication.vinduEnheter.getChildren().add(poengLabel);
    }

    public void SelectLevelUi() {
        Rectangle rect = new Rectangle();
        rect.setWidth(x);
        rect.setHeight(y);
        rect.setFill(Color.DARKBLUE);
        Button SelectLevel = new Button();
        Button SelectLevel2 = new Button();
        Button SelectLevel3 = new Button();
        SelectLevel.setText("Level 1");
        SelectLevel.setTranslateX(x/2+275);
        SelectLevel.setTranslateY(y/2+200);
        SelectLevel.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");
        SelectLevel2.setText("Level 2");
        SelectLevel2.setTranslateX(x/2+275);
        SelectLevel2.setTranslateY(y/2+250);
        SelectLevel2.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");
        SelectLevel3.setText("Level 3");
        SelectLevel3.setTranslateX(x/2+275);
        SelectLevel3.setTranslateY(y/2+300);
        SelectLevel3.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");

        VBox vbox = new VBox();
        vbox.setTranslateX(x/2 - 600);
        vbox.setTranslateY(y/2 - 600);
        vbox.getChildren().addAll(SelectLevel, SelectLevel2, SelectLevel3);

        SelectLevel.setOnAction(actionEvent -> {
            mapLoad mapLoad = new mapLoad();
            mapLoad.setKart(LEVEL1);

        });

        SelectLevel2.setOnAction(actionEvent -> {
            mapLoad mapLoad = new mapLoad();
            mapLoad.setKart(LEVEL2);


        });

        SelectLevel3.setOnAction(actionEvent -> {
            mapLoad mapLoad = new mapLoad();
            mapLoad.setKart(LEVEL3);

        });
        HelloApplication.uiVindu.getChildren().addAll(rect, vbox);
    }



}
