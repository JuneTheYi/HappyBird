package com.example.happybird;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView button;

    @FXML
    protected void userLogin() {
        HelloApplication start = new HelloApplication();
        start.changeScene("");
    }
}