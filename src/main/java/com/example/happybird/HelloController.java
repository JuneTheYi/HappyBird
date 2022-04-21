package com.example.happybird;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView button;

    @FXML
    protected void userLogin(ActionEvent event) throws IOException {
        Main start = new Main();
        start.changeScene("afterLogin.fxml");
    }
}