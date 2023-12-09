package com.example.financaspessoais;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
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

    double gasto = salario*0.5;

    public void preencherTabela(double salario){
        ObservableList<PieChart.Data> dataList = FXCollections.observableArrayList(
                new PieChart.Data("Disponivel", salario*0.5),
                new PieChart.Data("Gasto", salario*0.5),
                new PieChart.Data("Nada", 100)
        );
        dataList.forEach(data -> data.nameProperty().bind(Bindings.concat(data.getName(), " -> ", data.pieValueProperty())));
        grafico.setData(dataList);
        grafico.setLegendSide(Side.LEFT);
    }


    public void setSalario(double s){
        this.salario = s;
    }

    public void setNomeUsuario(String n){
        this.nomeUsuario.setText(n);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
