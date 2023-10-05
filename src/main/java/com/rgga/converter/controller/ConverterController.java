package com.rgga.converter.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConverterController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("asd");
    }
}