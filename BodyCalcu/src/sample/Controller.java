package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Controller {
    @FXML
    public TextField heigth;
    @FXML
    public TextField weight;
    @FXML
    public TextField age;
    @FXML
    public MenuButton gender;
    @FXML
    public MenuItem male;
    @FXML
    public MenuItem female;
    @FXML
    public Button calculate;
    @FXML
    public TextField BMI;
    @FXML
    public TextField perfectWeight;

    private HashMap<String,Integer> perfectWeightsMen;

    public void isMale(ActionEvent actionEvent) {
        gender.setText("Мъж");
    }

    public void isFemale(ActionEvent actionEvent) {
        gender.setText("Жена");
    }

    private double calculateBMI() {
        double height = Double.parseDouble(this.heigth.getText());
        double weight = Double.parseDouble(this.weight.getText());
        return weight / (height * height);
    }

    public void onCalculate(ActionEvent actionEvent) {
        Double BMI = calculateBMI();
        DecimalFormat df = new DecimalFormat("##.##");
        fillHashMap();
        this.BMI.setText(df.format(BMI));
        int perfectWeight = perfectWeightsMen.get(this.heigth.getText());
        this.perfectWeight.setText(String.valueOf(perfectWeight));
    }

    private void fillHashMap (){
        this.perfectWeightsMen = new HashMap<>();
        double baseHeight = 1.6;
        DecimalFormat df = new DecimalFormat("#.##");
        int baseWeight = 53;
        for (double i = baseHeight; i <= 2.2; i+= 0.01) {
            perfectWeightsMen.put(df.format(i),baseWeight);
            baseWeight++;
        }
    }

}
