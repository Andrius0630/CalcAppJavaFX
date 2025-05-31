package vu.oop.calcappjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CalcController {
    @FXML private TextField text_field;
    private final StringBuilder expression = new StringBuilder();
    private ExpressionSimplifier expSimplifier = new ExpressionSimplifier();
    private String localAnswer = "";


    @FXML
    public void add_1(ActionEvent e) {
        text_field.appendText("1");
    }

    public void add_2(ActionEvent event) {
        text_field.appendText("2");
    }

    public void add_3(ActionEvent event) {
        text_field.appendText("3");
    }

    public void add_4(ActionEvent event) {
        text_field.appendText("4");
    }

    public void add_5(ActionEvent event) {
        text_field.appendText("5");
    }

    public void add_6(ActionEvent event) {
        text_field.appendText("6");
    }

    public void add_7(ActionEvent event) {
        text_field.appendText("7");
    }

    public void add_8(ActionEvent event) {
        text_field.appendText("8");
    }

    public void add_9(ActionEvent event) {
        text_field.appendText("9");
    }

    public void add_left_bracket(ActionEvent event) {
        text_field.appendText("(");
    }

    public void add_0(ActionEvent event) {
        text_field.appendText("0");
    }

    public void add_right_bracket(ActionEvent event) {
        text_field.appendText(")");
    }

    public void del_char(ActionEvent event) {
        String currText = text_field.getText();
        if (!currText.isEmpty()) {
            text_field.setText(currText.substring(0, currText.length() - 1));
        }
        if (currText.compareTo(ExpressionSimplifier.BAD_EXPRESSION) == 0 || currText.compareTo(localAnswer) == 0)
            text_field.clear();
    }

    public void add_plus(ActionEvent event) {
        text_field.appendText("+");
    }

    public void add_mul(ActionEvent event) {
        text_field.appendText("*");
    }

    public void add_minus(ActionEvent event) {
        text_field.appendText("-");
    }

    public void add_div(ActionEvent event) {
        text_field.appendText("/");
    }

    public void clear_field(ActionEvent event) {
        text_field.clear();
    }

    public void get_result(ActionEvent event) throws Exception {
        localAnswer = expSimplifier.simplifyExpression(text_field.getText());
        text_field.setText(localAnswer);
    }
}