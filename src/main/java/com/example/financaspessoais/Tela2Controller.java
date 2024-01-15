package com.example.financaspessoais;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Tela2Controller implements Initializable {

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
    private Button tabela;

    @FXML
    private TableView<Despeza> table;

    @FXML
    private Button barra;

    @FXML
    private TableColumn<Despeza, String> descricao;

    @FXML
    private TableColumn<Despeza, Integer> despeza;

    @FXML
    private Button pizza;

    @FXML
    private Button botaoDespeza;

    @FXML
    private Button botaoRemove;

    @FXML
    private Button botaoEditar;

    @FXML
    private VBox formulario;

    @FXML
    private TextField value;

    @FXML
    private Button salvar;

    @FXML
    private Button cancelar;

    @FXML
    private TextField descr;

    private ObservableList<Despeza> despezas0 = FXCollections.observableArrayList();

    public void preencherGrafico2(double salario) {
        ObservableList<PieChart.Data> dataList = FXCollections.observableArrayList(
                new PieChart.Data("Disponivel", salario * 0.5),
                new PieChart.Data("Gasto", salario * 0.5),
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

    public void setSalario(double s) {
        this.salario = s;
    }

    public void setNomeUsuario(String n) {
        this.nomeUsuario.setText(n);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        grafico1.setVisible(false);
        grafico2.setVisible(false);
        table.setVisible(true);
        grafico3.setVisible(false);
        botaoDespeza.setVisible(true);
        botaoEditar.setVisible(true);
        botaoRemove.setVisible(true);
        formulario.setVisible(false);
        List<Despeza> despezas = new ArrayList<>();
        despezas.add(new Despeza("faxina", 80));
        despezas.add(new Despeza("luz", 36));
        descricao.setCellValueFactory(new PropertyValueFactory<Despeza, String>("descricao"));
        despeza.setCellValueFactory(new PropertyValueFactory<Despeza, Integer>("valor"));
        despezas0.addAll(despezas);
        this.table.setItems(despezas0);
    }

    @FXML
    void mostrarBarra(ActionEvent event) {
        grafico1.setVisible(false);
        grafico2.setVisible(false);
        grafico3.setVisible(true);
        table.setVisible(false);
        botaoDespeza.setVisible(false);
        botaoEditar.setVisible(false);
        botaoRemove.setVisible(false);
        formulario.setVisible(false);

    }

    @FXML
    void mostrarLinha(ActionEvent event) {
        grafico1.setVisible(true);
        grafico2.setVisible(false);
        grafico3.setVisible(false);
        table.setVisible(false);
        botaoDespeza.setVisible(false);
        botaoEditar.setVisible(false);
        botaoRemove.setVisible(false);
        formulario.setVisible(false);


    }

    @FXML
    void mostrarPizza(ActionEvent event) {
        grafico1.setVisible(false);
        grafico2.setVisible(true);
        table.setVisible(false);
        grafico3.setVisible(false);
        botaoDespeza.setVisible(false);
        botaoEditar.setVisible(false);
        botaoRemove.setVisible(false);
        formulario.setVisible(false);

    }

    @FXML
    void mostrartabela(ActionEvent event) {
        grafico1.setVisible(false);
        grafico2.setVisible(false);
        table.setVisible(true);
        grafico3.setVisible(false);
        botaoDespeza.setVisible(true);
        botaoEditar.setVisible(true);
        botaoRemove.setVisible(true);
        formulario.setVisible(false);

    }

    @FXML
    void addDespeza(ActionEvent event) {
        descr.setText("");
        value.setText("");
        formulario.setVisible(true);
        table.setVisible(false);
    }

    @FXML
    void removerItem(ActionEvent event) {
        table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
    }

    @FXML
    void editarItem(ActionEvent event) {
        formulario.setVisible(true);
        descr.setText(table.getSelectionModel().getSelectedItem().getDescricao());
        table.setVisible(false);
        value.setText("");

    }

    @FXML
    void acaoCancelar(ActionEvent event) {
        formulario.setVisible(false);
        table.setVisible(true);

    }

    @FXML
    void acaoSalvar(ActionEvent event) {
        try{
            table.setVisible(true);
            formulario.setVisible(false);
            Despeza des = new Despeza(descr.getText(), Double.parseDouble(value.getText()));
            despezas0.add(des);
            table.setItems(despezas0);
            if(table.getSelectionModel().getSelectedItem().getDescricao().equals(descr.getText())){
                table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
            }
        }
        catch (Exception E){
            table.setVisible(true);
            formulario.setVisible(false);
            Despeza des = new Despeza(table.getSelectionModel().getSelectedItem().getDescricao(), table.getSelectionModel().getSelectedItem().getValor());
            table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
            despezas0.add(des);
            table.setItems(despezas0);
        }
    }

}
