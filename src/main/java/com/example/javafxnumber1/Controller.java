package com.example.javafxnumber1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class Controller {
    ViewManager viewManager = new ViewManager();

    @FXML
    TextField usernameInput;
    @FXML
    PasswordField passwordInput;
    @FXML
    Button loginBtn;
    @FXML
    Label errorMessage;
    @FXML
    AnchorPane anchorPane1;
    @FXML
    AnchorPane anchorPane2;
    @FXML
    Button logoutBtn;
    @FXML
    TextField usdInput;
    @FXML
    TextField nisInput;
    @FXML
    Button convertBtn;
    @FXML
    Label errorMessageConvert;

    @FXML
    public void handleLogin(ActionEvent e) throws IOException {
        String username = usernameInput.getText();
        String password = passwordInput.getText();
        if (username.equals("user") && password.equals("userpass")) {
            viewManager.handleLogin(anchorPane1, "system-page.fxml");
        } else {
            errorMessage.setText("Invalid Information");
        }
    }

    @FXML
    public void handleLogout(ActionEvent e) throws IOException {
        viewManager.handleLogin(anchorPane2, "hello-view.fxml");
    }

    public double convertDollarsToShekels(double usd) {
        return usd * 3.67;
    }

    public double convertShekelToDollars(double nis) {
        return nis * 0.27;
    }

    @FXML
    public void handleConvertBtn() {
        String dollar = usdInput.getText().trim();
        String shekel = nisInput.getText().trim();
        if (!dollar.isEmpty() && shekel.isEmpty()) {
            double usd = Double.parseDouble(dollar);
            double nis = convertDollarsToShekels(usd);
            nisInput.clear();
            usdInput.clear();
            errorMessageConvert.setText(String.format("%.2f", nis));
        } else if (dollar.isEmpty() && !shekel.isEmpty()) {
            double shekels = Double.parseDouble(shekel);
            double dollars = convertShekelToDollars(shekels);
            nisInput.clear();
            usdInput.clear();
            errorMessageConvert.setText(String.format("%.2f", dollars));
        } else {
            errorMessage.setText("Error");
        }
    }


}
