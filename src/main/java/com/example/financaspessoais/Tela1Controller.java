package com.example.financaspessoais;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Tela1Controller {
    @FXML
    private Label welcomeText;

    private Stage stage;

    private Scene scene;

    private Parent root;

    @FXML
    private TextField nome;

    @FXML
    private TextField renda;


    public void onHelloButtonClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tela2.fxml"));
        root = loader.load();
        Tela2Controller tela2Controller = loader.getController();

        tela2Controller.setSalario(Double.parseDouble(renda.getText().toString()));
        tela2Controller.setNomeUsuario("olá, " + nome.getText().toString() + "!");
        tela2Controller.preencherGrafico1(Double.parseDouble(renda.getText().toString()));
        tela2Controller.preencherGrafico2(Double.parseDouble(renda.getText().toString()));
        tela2Controller.preencherGrafico3(Double.parseDouble(renda.getText().toString()));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(850);
        stage.setResizable(false);
        stage.setHeight(600);
        stage.show();

    }
}