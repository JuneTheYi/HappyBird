package com.example.happybird;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stg; // going to need this variable to change scenes

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false); // so  user can't maximize the window
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 800);
        scene.getRoot().requestFocus(); // required for KeyEvent on AfterLoginController.java pressed() function
        // reloads the scene, otherwise the key won't load
        stage.setTitle("Happy (Flappy) Bird Game");
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String fxml) throws IOException { // you pass fxml file from line 19 to which u want to change the scene
        Parent pane = FXMLLoader.load(getClass().getResource(fxml)); // load the file to change the scene
        stg.getScene().setRoot(pane); //change the scene similar to line 21-23
    }

    public static void main(String[] args) {
        launch(args);
    }

}
