package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.parseFloat;

/**calculadora*/
public class HelloController {
    @FXML
    private Button barraMenos;

    @FXML
    private Button cinco;

    @FXML
    private Button dividir;

    @FXML
    private Button dois;

    @FXML
    private Button igualdade;

    @FXML
    private Button limpar;

    @FXML
    private Button multiplicar;

    @FXML
    private Button nove;

    @FXML
    private Button oito;

    @FXML
    private Button quatro;

    @FXML
    private Button seis;

    @FXML
    private Button sete;

    @FXML
    private Button somar;

    @FXML
    private Button subtrair;

    @FXML
    private Button tres;

    @FXML
    private Button um;

    @FXML
    private Button virgula;

    @FXML
    private Button zero;

    @FXML
    private Label operacao;

    private boolean aberto = false;

    private Integer ultimoDigito;

    private List<String> list = new ArrayList<>();

    private String resultado;

    private String numero = "";

    public HelloController() {
    }

    @FXML
    void addBarraMenos(ActionEvent event) {
        if(list.size() == 0){
            numero = String.valueOf(Float.parseFloat(numero) * -1);
            operacao.setText(numero);
        }
        if(operacao.getText().length()<20 && list.size()!=0){
            float num = 0;
            if(!(numero.equals(""))){
                if(list.get(list.size()-1).equals("+") || list.get(list.size()-1).equals("-")) {
                    num = -1 * Float.parseFloat(operacao.getText().substring(operacao.getText().length() - 2, operacao.getText().length()));
                    operacao.setText(operacao.getText().substring(0, operacao.getText().length()-2));
                }
                else if(list.get(list.size()-1).equals("x") || list.get(list.size()-1).equals("÷")){
                    num = -1 * Float.parseFloat(operacao.getText().substring(operacao.getText().length() - 1, operacao.getText().length()));
                    operacao.setText(operacao.getText().substring(0, operacao.getText().length()-1));
                }
                numero = String.valueOf(num);
                if(num < 0){
                    operacao.setText(operacao.getText() + numero);
                }
                else if(num > 0){
                    operacao.setText(operacao.getText() + " + " + numero);
                    list.set(list.size()-1, "+");
                }
            }
            else {
                num = -1 * Float.parseFloat(list.get(list.size()-2));
                operacao.setText(operacao.getText() + " negate(" + num * -1 + ")");
                numero = String.valueOf(num);
            }
        }
    }

    @FXML
    void addCinco(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "5");
            numero += "5";
        }
    }

    @FXML
    void addDividir(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(!(numero.equals(""))){
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 ÷ ");
                    list.add("0");
                    list.add("÷");
                }
                else{
                    if(!(numero.equals(""))){
                        list.add(numero);
                    }
                    if(!(list.get(list.size() - 1).equals("+")) && !(list.get(list.size() - 1).equals("x")) && !(list.get(list.size() - 1).equals("-")) && !(list.get(list.size() - 1).equals("÷"))){
                        operacao.setText(operacao.getText() + " ÷ ");
                        list.add("÷");
                        numero = "";
                    }
                }
            }
            else{
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 ÷ ");
                    list.add("0");
                    list.add("÷");
                }
                else{
                    list.remove(list.size()-1);
                    list.add("÷");
                    operacao.setText(operacao.getText().substring(0, operacao.getText().length()-2));
                    operacao.setText(operacao.getText() + " ÷");
                }
            }
        }
    }

    @FXML
    void addDois(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "2");
            numero += "2";
        }
    }

    @FXML
    void addMultiplicar(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(!(numero.equals(""))){
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 x ");
                    list.add("0");
                    list.add("x");
                }
                else{
                    if(!(numero.equals(""))){
                        list.add(numero);
                    }
                    if(!(list.get(list.size() - 1).equals("+")) && !(list.get(list.size() - 1).equals("x")) && !(list.get(list.size() - 1).equals("-")) && !(list.get(list.size() - 1).equals("÷"))) {
                        operacao.setText(operacao.getText() + " x ");
                        list.add("x");
                        numero = "";
                    }
                }
            }
            else{
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 x ");
                    list.add("0");
                    list.add("x");
                }
                else{
                    list.remove(list.size()-1);
                    list.add("x");
                    operacao.setText(operacao.getText().substring(0, operacao.getText().length()-2));
                    operacao.setText(operacao.getText() + " x");
                }
            }
        }
    }

    @FXML
    void addNove(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "9");
            numero += "9";
        }
    }

    @FXML
    void addOito(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "8");
            numero += "8";
        }
    }

    @FXML
    void addQuatro(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "4");
            numero += "4";
        }
    }

    @FXML
    void addSeis(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "6");
            numero += "6";
        }
    }

    @FXML
    void addSete(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "7");
            numero += "7";
        }
    }

    @FXML
    void addSoma(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if (!(numero.equals(""))){
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 + ");
                    list.add("0");
                    list.add("+");
                }
                else{
                    if(!(numero.equals(""))){
                        list.add(numero);
                    }
                    if(!(list.get(list.size() - 1).equals("+")) && !(list.get(list.size() - 1).equals("x")) && !(list.get(list.size() - 1).equals("-")) && !(list.get(list.size() - 1).equals("÷"))){
                        operacao.setText(operacao.getText() + " + ");
                        list.add("+");
                        numero = "";
                    }
                }
            }
            else{
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 + ");
                    list.add("0");
                    list.add("+");
                }
                else{
                    list.remove(list.size()-1);
                    list.add("+");
                    operacao.setText(operacao.getText().substring(0, operacao.getText().length()-2));
                    operacao.setText(operacao.getText() + " +");
                }
            }
        }
    }

    @FXML
    void addSubtrair(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(!(numero.equals(""))){
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 - ");
                    list.add("0");
                    list.add("-");
                }
                else{
                    if(!(numero.equals(""))){
                        list.add(numero);
                    }
                    if(!(list.get(list.size() - 1).equals("+")) && !(list.get(list.size() - 1).equals("x")) && !(list.get(list.size() - 1).equals("-")) && !(list.get(list.size() - 1).equals("÷"))){
                        operacao.setText(operacao.getText() + " - ");
                        list.add("-");
                        numero = "";
                    }
                }
            }
            else{
                if(operacao.getText().length()==0){
                    operacao.setText(operacao.getText() + " 0 - ");
                    list.add("0");
                    list.add("-");
                }
                else{
                    list.remove(list.size()-1);
                    list.add("-");
                    operacao.setText(operacao.getText().substring(0, operacao.getText().length()-2));
                    operacao.setText(operacao.getText() + " -");
                }
            }
        }
    }

    @FXML
    void addTres(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "3");
            numero += "3";
        }
    }

    @FXML
    void addUm(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "1");
            numero += "1";
        }
    }

    @FXML
    void addZero(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            operacao.setText(operacao.getText() + "0");
            numero += "0";
        }
    }

    @FXML
    void addvirgula(ActionEvent event) {
        if(operacao.getText().length()<20) {
            if(list.size()==1){
                limpar(new ActionEvent());
            }
            if(!(numero.equals("0."))){
                if(list.size()==0){
                    numero += "0";
                    operacao.setText(operacao.getText() + "0");
                }
                operacao.setText(operacao.getText() + ",");
                numero += ".";
            }
        }
    }

    @FXML
    void limpar(ActionEvent event) {
        operacao.setText("");
        list.clear();
        resultado = "";
        numero = "";
    }

    @FXML
    void operar(ActionEvent event) {
        if(!(numero.equals(""))){
            list.add(numero);
        }
        if(!(list.get(list.size() - 1).equals("+")) && !(list.get(list.size() - 1).equals("x")) && !(list.get(list.size() - 1).equals("-")) && !(list.get(list.size() - 1).equals("÷"))) {
            float valor = 0;
            boolean entrou = false;
            List<String> aux = new ArrayList<>();
            int posicao = -1;
            if (list.contains("0")) {
                posicao = list.indexOf("0");
            }
            if (posicao != -1 && posicao != 0 && list.get(posicao - 1).equals("÷")) {
                operacao.setText("Não é possível dividir por zero");
            } else {
                if (!(list.get(1).equals("÷") && list.get(1).equals("x"))) {
                    aux.add(list.get(0));
                }
                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i).equals("x")) {
                        valor = parseFloat(list.get(i - 1)) * parseFloat(list.get(i + 1));
                        list.set(i + 1, Float.toString(valor));
                        entrou = true;
                    } else if (list.get(i).equals("÷")) {
                        valor = parseFloat(list.get(i - 1)) / parseFloat(list.get(i + 1));
                        list.set(i + 1, Float.toString(valor));
                        entrou = true;
                    } else {
                        if (entrou) {
                            if (aux.size() != 0) {
                                aux.remove(aux.size() - 1);
                            }
                            aux.add(Float.toString(valor));
                            valor = 0;
                            entrou = false;
                        } else {
                            aux.add(list.get(i));
                        }
                    }
                }
                float valorOperacao = parseFloat(aux.get(0));
                for (int ii = 1; ii < aux.size(); ii++) {
                    System.out.println(valorOperacao);
                    if (aux.get(ii).equals("+")) {
                        valorOperacao += parseFloat(aux.get(ii + 1));
                    } else if (aux.get(ii).equals("-")) {
                        valorOperacao -= parseFloat(aux.get(ii + 1));
                    }
                }
                resultado = Float.toString(valorOperacao);
                operacao.setText(resultado);
            }
            list.clear();
            aux.clear();
            numero = "";
            list.add(resultado);
            resultado = "";
        }
        else{
            operacao.setText("Operação incompleta, resposta padrão = 0");
        }
    }
}