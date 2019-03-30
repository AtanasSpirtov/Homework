package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    public Button btnAction;
    @FXML
    public Button btnExit;
    @FXML
    public RadioButton bulgaria;
    @FXML
    public RadioButton russia;
    @FXML
    public RadioButton japanese;


    public void onExiting(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        // do what you have to do
        stage.close();
    }



    public void showBGFlag(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("BGFlag.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) bulgaria.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void showRUFlag(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("RUFlag.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) russia.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void showJPFlag(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("JPFlag.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) japanese.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
