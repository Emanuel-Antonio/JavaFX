package com.example.conversorunidade;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class main{
    @FXML
    private Button tamanho;
    @FXML
    private Button temperatura;
    @FXML
    private PieChart grafico;

    private Stage stage;

    private Scene scene;

    private Parent root;

    @FXML
    void tamanhoOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tam.fxml"));
        root = loader.load();
        TamController tela2Controller = loader.getController();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setWidth(600);
        stage.setHeight(600);
    }
    @FXML
    void temperaturaOnAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("temp.fxml"));
        root = loader.load();
        TempController tela2Controller = loader.getController();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setWidth(600);
        stage.setHeight(600);
    }
}
