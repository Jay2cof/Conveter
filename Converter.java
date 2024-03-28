package com.example.converter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Converter {
    @FXML
    Label FirstName;
    @FXML
    Label Surname;

    @FXML
    TextField txt_FirstName;
    @FXML
    TextField txt_Surname;
    @FXML
    Button cmd_PressMe;

    @FXML
    protected void showAllInformation() {
        String FirstName = txt_FirstName.getText();
        String Surname = txt_Surname.getText();

        Alert convert = new Alert(Alert.AlertType.INFORMATION);
        convert.setContentText(FirstName + " " + Surname);
        convert.show();

    }
}