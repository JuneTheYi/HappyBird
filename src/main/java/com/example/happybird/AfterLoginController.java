package com.example.happybird;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * this is our controller for what happens in main action screen
 */
public class AfterLoginController implements Initializable {

    AnimationTimer gameLoop;

    @FXML
    private AnchorPane background;
    @FXML
    private ImageView backpicture;
    @FXML
    private ImageView bird;

    double yDelta = 0.02; // how much movement every frame
    double time = 0; // how much frames we've moved so far
    int jumpHeight =  25; //how much bird jumps per click

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        load();

        gameLoop = new AnimationTimer() {
            @Override
            public void handle(long l) {
                update();
            }
        };
        gameLoop.start();
    }

    @FXML
    protected void pressed(MouseEvent event) {
        if (MouseEvent.MOUSE_PRESSED) {
            fly();
        }
    }

    private void fly() {
        if (bird.getLayoutY() + bird.getY() <= jumpHeight) {
            moveBirdY(-(bird.getLayoutY() + bird.getY()));
            time = 0;
            return;
        }

        moveBirdY(-jumpHeight);
        time = 0;
    }

    // called every game frame
    private void update() {
        time++;
        moveBirdY(yDelta * time);

        if (isBirdDead()) {
            resetBird();
        }
    }

    //Everything called once, at the game start
    private void load(){
        System.out.println("Game starting");

    }

    private void moveBirdY(double positionChange){
        bird.setY(bird.getY() + positionChange);
    }

    private boolean isBirdDead(){
        double birdY = bird.getLayoutY() + bird.getY();
        return birdY >= background.getHeight();
    }

    private void resetBird(){
        bird.setY(0);
        time = 0;
    }

}
