package com.example.javafxnumber1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Model extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Model.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        FXMLLoader fxmlLoader1 = new FXMLLoader(Model.class.getResource("system-page.fxml"));
        Parent root1 = fxmlLoader1.load();
        Scene scene = new Scene(root);

        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

}
