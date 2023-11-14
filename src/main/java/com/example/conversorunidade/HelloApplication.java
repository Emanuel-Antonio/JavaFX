package com.example.conversorunidade;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;

    private static Scene main;

    private static Scene temp;

    private static Scene tam;
    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        primaryStage.setTitle("");
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("main.fxml"));
        main = new Scene(fxmlLogin);

        primaryStage.setScene(main);
        primaryStage.setWidth(500);
        primaryStage.setHeight(450);
        primaryStage.show();

        Parent fxmlTemp = FXMLLoader.load(getClass().getResource("temp.fxml"));
        temp = new Scene(fxmlTemp);

        Parent fxmltam = FXMLLoader.load(getClass().getResource("tam.fxml"));
        tam = new Scene(fxmltam);

    }

    public static void telaScreen(String nome) {
        switch (nome) {
            case "main":
                stage.setScene(main);
                stage.setWidth(500);
                stage.setHeight(450);
                stage.setResizable(false);
                break;
            case "temp":
                stage.setScene(temp);
                stage.setWidth(500);
                stage.setHeight(450);
                stage.setResizable(false);
                break;
            case "tam":
                stage.setScene(tam);
                stage.setWidth(500);
                stage.setHeight(450);
                stage.setResizable(false);
                break;
        }
    }
    public static void main(String[] args) { launch(args); }
}