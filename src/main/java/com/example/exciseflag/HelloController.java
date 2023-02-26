package com.example.exciseflag;

import javafx.animation.Interpolatable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController implements Interpolatable<Color> {

    @FXML
    private Rectangle color1rec;

    @FXML
    private Rectangle color2rec;

    @FXML
    private Rectangle color3rec;

    @FXML
    void CLEARButtonOnAction(ActionEvent event) {
        color1rec.setFill(null);
        color2rec.setFill(null);
        color3rec.setFill(null);
    }

    @FXML
    void HungaryButtonOnAction(ActionEvent event) {
        color1rec.setFill(Color.rgb(206, 41, 57));
        color2rec.setFill(Color.rgb(255, 255, 255));
        color3rec.setFill(Color.rgb(71, 112, 80));
    }

    @FXML
    void LatviaButtonOnAction(ActionEvent event) {
        color1rec.setFill(Color.rgb(150,0,24));
        color2rec.setFill(Color.rgb(255, 255, 255));
        color3rec.setFill(Color.rgb(150,0,24));
    }

    @FXML
    void LesothoButtonOnAction(ActionEvent event) {
        color1rec.setFill(Color.rgb(0, 20, 137));
        color2rec.setFill(Color.rgb(255, 255, 255));
        color3rec.setFill(Color.rgb(0, 154, 68));
    }

    @FXML
    void LithuaniaButtonOnAction(ActionEvent event) {
        color1rec.setFill(Color.rgb(255, 184, 28));
        color2rec.setFill(Color.rgb(4, 106, 56));
        color3rec.setFill(Color.rgb(190, 58, 52));
    }
    @FXML
    void LuxembourgButtonOnAction(ActionEvent event) {
        color1rec.setFill(Color.rgb(234, 20, 29));
        color2rec.setFill(Color.rgb(255, 255, 255));
        color3rec.setFill(Color.rgb(81, 173, 218));
    }

    @Override
    public Color interpolate(Color color, double v) {
        return null;
    }
}
