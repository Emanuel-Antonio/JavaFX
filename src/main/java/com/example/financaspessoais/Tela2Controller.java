package com.example.financaspessoais;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Tela2Controller implements Initializable {

    @FXML
    private Label nomeUsuario;
    @FXML
    private PieChart grafico;

    private double salario;

    double gasto = 10;

    ObservableList<PieChart.Data> dataList = FXCollections.observableArrayList(
            new PieChart.Data("Disponivel", salario),
            new PieChart.Data("Gasto", 30),
            new PieChart.Data("Nada", 10)
    );

    public void setSalario(double s){
        this.salario = s;
    }

    public void setNomeUsuario(String n){
        this.nomeUsuario.setText(n);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        grafico.setData(dataList);
    }
}
