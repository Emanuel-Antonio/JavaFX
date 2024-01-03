package com.example.conversorunidade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TempController implements Initializable {
    @FXML
    private Button converter;
    @FXML
    private Button voltar;
    @FXML
    private TextField entrada;
    @FXML
    private TextField saida;
    @FXML
    private ComboBox<String> selecao1;
    @FXML
    private ComboBox<String> selecao2;

    private Stage stage;

    private Scene scene;

    private Parent root;
    @FXML
    void converterOnAction(ActionEvent event) {
        if(!(selecao2.getValue() == null) && !(selecao1.getValue() == null)) {
            if (selecao1.getValue().equals("Graus Celsius (°C)") && selecao2.getValue().equals("Graus Fahrenheit (°F)")) {
                double f = Double.parseDouble(entrada.getText()) * 1.8 + 32;
                saida.setText(Double.toString(f));
            }
            else if (selecao1.getValue().equals("Graus Celsius (°C)") && selecao2.getValue().equals("Kelvin (K)")) {
                double k = Double.parseDouble(entrada.getText()) + 273;
                saida.setText(Double.toString(k));
            }
            else if (selecao1.getValue().equals("Graus Fahrenheit (°F)") && selecao2.getValue().equals("Graus Celsius (°C)")) {
                double c = (Double.parseDouble(entrada.getText()) - 32) / 1.8;
                saida.setText(Double.toString(c));
            }
            else if(selecao1.getValue().equals("Graus Fahrenheit (°F)") && selecao2.getValue().equals("Kelvin (K)")){
                double c = (Double.parseDouble(entrada.getText()) - 32) / 1.8;
                double k = c + 273;
                saida.setText(Double.toString(k));
            }
            else if(selecao1.getValue().equals("Kelvin (K)") && selecao2.getValue().equals("Graus Celsius (°C)")){
                double c = Double.parseDouble(entrada.getText()) - 273;
                saida.setText(Double.toString(c));
            }
            else if(selecao1.getValue().equals("Kelvin (K)") && selecao2.getValue().equals("Graus Fahrenheit (°F)")){
                double c = Double.parseDouble(entrada.getText()) - 273;
                double f = c * 1.8 + 32;
                saida.setText(Double.toString(f));            }
            else{
                saida.setText(entrada.getText());
            }
        }
        else{
            saida.setText("Escolha as unidades");
        }
    }
    @FXML
    void voltarOnAcrion(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        root = loader.load();
        main tela2Controller = loader.getController();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setWidth(600);
        stage.setHeight(600);
        entrada.setText("");
        saida.setText("");
        selecao2.setValue("");
        selecao1.setValue("");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selecao1.getItems().addAll("Graus Celsius (°C)", "Graus Fahrenheit (°F)", "Kelvin (K)");
        selecao2.getItems().addAll("Graus Celsius (°C)", "Graus Fahrenheit (°F)", "Kelvin (K)");
    }
}
