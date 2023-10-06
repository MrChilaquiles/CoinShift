package com.rgga.converter.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConverterController implements Initializable {
    public TextField textAmount;
    @FXML
    private ChoiceBox<String> SelectCoin;
    private String[] coins = {"USD", "MXN", "JPY", "EUR", "ARS"};
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        SelectCoin.getItems().addAll(coins);
    }
}