package com.example.conversorunidade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class main {
    @FXML
    private Button tamanho;
    @FXML
    private Button temperatura;
    @FXML
    void tamanhoOnAction(ActionEvent event) {
        HelloApplication.telaScreen("tam");
    }
    @FXML
    void temperaturaOnAction(ActionEvent event) {
        HelloApplication.telaScreen("temp");
    }
}
