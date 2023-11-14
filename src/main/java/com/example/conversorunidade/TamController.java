package com.example.conversorunidade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TamController implements Initializable {
    @FXML
    private Button converter;
    @FXML
    private TextField entrada;
    @FXML
    private TextField saida;
    @FXML
    private ComboBox<String> selecao1;
    @FXML
    private ComboBox<String> selecao2;
    @FXML
    private Button voltar;
    @FXML
    void converterOnAction(ActionEvent event) {

    }

    @FXML
    void voltarOnAcrion(ActionEvent event) {
        HelloApplication.telaScreen("main");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selecao1.getItems().addAll("km", "hm", "dam", "m", "dm", "cm", "mm");
        selecao2.getItems().addAll("km", "hm", "dam", "m", "dm", "cm", "mm");
    }
}
