package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    @FXML
    public RadioButton groupA;
    @FXML
    public RadioButton groupB;
    @FXML
    public Button action;
    @FXML
    public Button Exit;

     Scanner scanner = new Scanner(System.in);
    public List<String> names = new ArrayList<String>();
    {
            names.add("Adam Malkiq");
            names.add("GROZ Golemiq");
            names.add("Tomov Kucheto");
            names.add("Slabak Slabakov");



    }
    public void isSelectedA(ActionEvent actionEvent) {
        if(groupA.isArmed())
        {

        }
    }

    public void onAction(ActionEvent actionEvent) {

    }

    public void onExit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void isSelectedB(ActionEvent actionEvent) {
        if(groupB.isArmed())
        {

        }
    }
}
