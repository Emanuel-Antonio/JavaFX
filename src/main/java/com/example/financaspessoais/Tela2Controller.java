package com.example.financaspessoais;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Tela2Controller implements Initializable{

    @FXML
    private Label nomeUsuario;

    @FXML
    private PieChart grafico2;

    @FXML
    private LineChart<String, Integer> grafico1;

    @FXML
    private BarChart<String, Integer> grafico3;

    private double salario;

    @FXML
    private Button linha;

    @FXML
    private Button barra;

    @FXML
    private Button pizza;

    public void preencherGrafico2(double salario){
        ObservableList<PieChart.Data> dataList = FXCollections.observableArrayList(
                new PieChart.Data("Disponivel", salario*0.5),
                new PieChart.Data("Gasto", salario*0.5),
                new PieChart.Data("Nada", 100)
        );
        dataList.forEach(data -> data.nameProperty().bind(Bindings.concat(data.getName(), " -> ", data.pieValueProperty())));
        grafico2.setData(dataList);
        grafico2.setLegendSide(Side.LEFT);
    }

    public void preencherGrafico1(double salario) {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data<>("Segunda", 2));
        series.getData().add(new XYChart.Data<>("Terça", 4));
        series.getData().add(new XYChart.Data<>("Quarta", 6));
        series.getData().add(new XYChart.Data<>("Quinta", 2));
        series.getData().add(new XYChart.Data<>("Sexta", 6));
        series.getData().add(new XYChart.Data<>("Sabado", 4));
        series.getData().add(new XYChart.Data<>("Domingo", 2));
        grafico1.getData().addAll(series);
        grafico1.setLegendVisible(false);

    }

    public void preencherGrafico3(double salario) {
        XYChart.Series<String, Integer> series1 = new XYChart.Series();
        series1.setName("consumo dia");
        series1.getData().add(new XYChart.Data<>("Segunda", 2));
        series1.getData().add(new XYChart.Data<>("Terça", 4));
        series1.getData().add(new XYChart.Data<>("Quarta", 6));
        series1.getData().add(new XYChart.Data<>("Quinta", 2));
        series1.getData().add(new XYChart.Data<>("Sexta", 6));
        series1.getData().add(new XYChart.Data<>("Sabado", 4));
        series1.getData().add(new XYChart.Data<>("Domingo", 2));
        grafico3.getData().addAll(series1);
    }

    public void setSalario(double s){
        this.salario = s;
    }

    public void setNomeUsuario(String n){
        this.nomeUsuario.setText(n);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        grafico1.setVisible(true);
        grafico2.setVisible(false);
        grafico3.setVisible(false);
    }

    @FXML
    void mostrarBarra(ActionEvent event) {
        grafico1.setVisible(false);
        grafico2.setVisible(false);
        grafico3.setVisible(true);
    }

    @FXML
    void mostrarLinha(ActionEvent event) {
        grafico1.setVisible(true);
        grafico2.setVisible(false);
        grafico3.setVisible(false);
    }

    @FXML
    void mostrarPizza(ActionEvent event) {
        grafico1.setVisible(false);
        grafico2.setVisible(true);
        grafico3.setVisible(false);
    }
}
