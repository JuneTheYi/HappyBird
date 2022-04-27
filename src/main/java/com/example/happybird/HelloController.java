package com.example.happybird;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;

/**
 * This is our controller for what happens on the main login page
 */
public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView button;

    @FXML
    protected void userLogin(ActionEvent event) throws IOException {
        Main start = new Main(); // initializes Main() and assigns it to variable start
        start.changeScene("afterLogin.fxml"); // uses function changeScene from Main.java
    }
}