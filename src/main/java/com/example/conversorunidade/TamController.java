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
        if(!(selecao1.getValue().equals("")) && !(selecao2.getValue().equals(""))){
            double valor = 0;
            if(selecao1.getValue().equals("km") && selecao2.getValue().equals("hm")){
                valor = Double.parseDouble(entrada.getText()) * 10;
            }
            else if (selecao1.getValue().equals("km") && selecao2.getValue().equals("dam")) {
                valor = Double.parseDouble(entrada.getText()) * 100;
            }
            else if (selecao1.getValue().equals("km") && selecao2.getValue().equals("m")){
                valor = Double.parseDouble(entrada.getText()) * 1000;
            }
            else if (selecao1.getValue().equals("km") && selecao2.getValue().equals("dm")){
                valor = Double.parseDouble(entrada.getText()) * 10000;
            }
            else if (selecao1.getValue().equals("km") && selecao2.getValue().equals("cm")){
                valor = Double.parseDouble(entrada.getText()) * 100000;
            }
            else if (selecao1.getValue().equals("km") && selecao2.getValue().equals("mm")){
                valor = Double.parseDouble(entrada.getText()) * 1000000;
            }
            else if (selecao1.getValue().equals("hm") && selecao2.getValue().equals("km")){
                valor = Double.parseDouble(entrada.getText()) / 10;
            }
            else if (selecao1.getValue().equals("hm") && selecao2.getValue().equals("dam")){
                valor = Double.parseDouble(entrada.getText()) * 10;
            }
            else if (selecao1.getValue().equals("hm") && selecao2.getValue().equals("m")){
                valor = Double.parseDouble(entrada.getText()) * 100;
            }
            else if (selecao1.getValue().equals("hm") && selecao2.getValue().equals("dm")){
                valor = Double.parseDouble(entrada.getText()) * 1000;
            }
            else if (selecao1.getValue().equals("hm") && selecao2.getValue().equals("cm")){
                valor = Double.parseDouble(entrada.getText()) * 10000;
            }
            else if (selecao1.getValue().equals("hm") && selecao2.getValue().equals("mm")){
                valor = Double.parseDouble(entrada.getText()) * 100000;
            }
            else if (selecao1.getValue().equals("dam") && selecao2.getValue().equals("km")){
                valor = Double.parseDouble(entrada.getText()) / 100;
            }
            else if (selecao1.getValue().equals("dam") && selecao2.getValue().equals("hm")){
                valor = Double.parseDouble(entrada.getText()) / 10;
            }
            else if (selecao1.getValue().equals("dam") && selecao2.getValue().equals("m")){
                valor = Double.parseDouble(entrada.getText()) * 10;
            }
            else if (selecao1.getValue().equals("dam") && selecao2.getValue().equals("dm")){
                valor = Double.parseDouble(entrada.getText()) * 100;
            }
            else if (selecao1.getValue().equals("dam") && selecao2.getValue().equals("cm")){
                valor = Double.parseDouble(entrada.getText()) * 1000;
            }
            else if (selecao1.getValue().equals("dam") && selecao2.getValue().equals("mm")){
                valor = Double.parseDouble(entrada.getText()) * 10000;
            }
            else if (selecao1.getValue().equals("m") && selecao2.getValue().equals("km")){
                valor = Double.parseDouble(entrada.getText()) / 1000;
            }
            else if (selecao1.getValue().equals("m") && selecao2.getValue().equals("hm")){
                valor = Double.parseDouble(entrada.getText()) / 100;
            }
            else if (selecao1.getValue().equals("m") && selecao2.getValue().equals("dam")){
                valor = Double.parseDouble(entrada.getText()) / 10;
            }
            else if (selecao1.getValue().equals("m") && selecao2.getValue().equals("dm")){
                valor = Double.parseDouble(entrada.getText()) * 10;
            }
            else if (selecao1.getValue().equals("m") && selecao2.getValue().equals("cm")){
                valor = Double.parseDouble(entrada.getText()) * 100;
            }
            else if (selecao1.getValue().equals("m") && selecao2.getValue().equals("mm")){
                valor = Double.parseDouble(entrada.getText()) * 1000;
            }
            else if (selecao1.getValue().equals("dm") && selecao2.getValue().equals("km")){
                valor = Double.parseDouble(entrada.getText()) / 10000;
            }
            else if (selecao1.getValue().equals("dm") && selecao2.getValue().equals("hm")){
                valor = Double.parseDouble(entrada.getText()) / 1000;
            }
            else if (selecao1.getValue().equals("dm") && selecao2.getValue().equals("dam")){
                valor = Double.parseDouble(entrada.getText()) / 100;
            }
            else if (selecao1.getValue().equals("dm") && selecao2.getValue().equals("m")){
                valor = Double.parseDouble(entrada.getText()) / 10;
            }
            else if (selecao1.getValue().equals("dm") && selecao2.getValue().equals("cm")){
                valor = Double.parseDouble(entrada.getText()) * 10;
            }
            else if (selecao1.getValue().equals("dm") && selecao2.getValue().equals("mm")){
                valor = Double.parseDouble(entrada.getText()) * 100;
            }
            else if (selecao1.getValue().equals("cm") && selecao2.getValue().equals("km")){
                valor = Double.parseDouble(entrada.getText()) / 100000;
            }
            else if (selecao1.getValue().equals("cm") && selecao2.getValue().equals("hm")){
                valor = Double.parseDouble(entrada.getText()) / 10000;
            }
            else if (selecao1.getValue().equals("cm") && selecao2.getValue().equals("dam")){
                valor = Double.parseDouble(entrada.getText()) / 1000;
            }
            else if (selecao1.getValue().equals("cm") && selecao2.getValue().equals("m")){
                valor = Double.parseDouble(entrada.getText()) / 100;
            }
            else if (selecao1.getValue().equals("cm") && selecao2.getValue().equals("dm")){
                valor = Double.parseDouble(entrada.getText()) / 10;
            }
            else if (selecao1.getValue().equals("cm") && selecao2.getValue().equals("mm")){
                valor = Double.parseDouble(entrada.getText()) * 10;
            }
            else if (selecao1.getValue().equals("mm") && selecao2.getValue().equals("km")){
                valor = Double.parseDouble(entrada.getText()) / 1000000;
            }
            else if (selecao1.getValue().equals("mm") && selecao2.getValue().equals("hm")){
                valor = Double.parseDouble(entrada.getText()) / 100000;
            }
            else if (selecao1.getValue().equals("mm") && selecao2.getValue().equals("dam")){
                valor = Double.parseDouble(entrada.getText()) / 10000;
            }
            else if (selecao1.getValue().equals("mm") && selecao2.getValue().equals("m")){
                valor = Double.parseDouble(entrada.getText()) / 1000;
            }
            else if (selecao1.getValue().equals("mm") && selecao2.getValue().equals("dm")){
                valor = Double.parseDouble(entrada.getText()) / 100;
            }
            else if (selecao1.getValue().equals("mm") && selecao2.getValue().equals("cm")){
                valor = Double.parseDouble(entrada.getText()) / 10;
            }
            else{
                valor = Double.parseDouble(entrada.getText());
            }
            saida.setText(Double.toString(valor));
        }
        else{
            saida.setText("Escolha as unidades");
        }
    }

    @FXML
    void voltarOnAcrion(ActionEvent event) {
        HelloApplication.telaScreen("main");
        entrada.setText("");
        saida.setText("");
        selecao2.setValue("");
        selecao1.setValue("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selecao1.getItems().addAll("", "km", "hm", "dam", "m", "dm", "cm", "mm");
        selecao2.getItems().addAll("", "km", "hm", "dam", "m", "dm", "cm", "mm");
    }
}
