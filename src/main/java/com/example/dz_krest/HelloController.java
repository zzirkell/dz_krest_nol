package com.example.dz_krest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.util.Objects;

public class HelloController {

    @FXML
    private Button but_1;

    @FXML
    private Button but_2;

    @FXML
    private Button but_3;

    @FXML
    private Button but_4;

    @FXML
    private Button but_5;

    @FXML
    private Button but_6;

    @FXML
    private Button but_7;

    @FXML
    private Button but_8;

    @FXML
    private Button but_9;

    @FXML
    private Text winner_is;

    int turn = 0;

    @FXML
    void restart_xo() {
        but_1.setText("");
        but_2.setText("");
        but_3.setText("");
        but_4.setText("");
        but_5.setText("");
        but_6.setText("");
        but_7.setText("");
        but_8.setText("");
        but_9.setText("");
        winner_is.setText("");
        turn = 0;
    }

    @FXML
    void how_to_win(){
        if ((Objects.equals(but_1.getText(), but_5.getText())) && (Objects.equals(but_5.getText(), but_9.getText()))){
            if (Objects.equals(but_9.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_9.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        if ((Objects.equals(but_3.getText(), but_5.getText())) && (Objects.equals(but_5.getText(), but_7.getText()))){
            if (Objects.equals(but_7.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_7.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        if ((Objects.equals(but_2.getText(), but_5.getText())) && (Objects.equals(but_5.getText(), but_8.getText()))){
            if (Objects.equals(but_8.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_8.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        if ((Objects.equals(but_4.getText(), but_5.getText())) && (Objects.equals(but_5.getText(), but_6.getText()))){
            if (Objects.equals(but_6.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_6.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        if ((Objects.equals(but_1.getText(), but_2.getText())) && (Objects.equals(but_2.getText(), but_3.getText()))){
            if (Objects.equals(but_2.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_2.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        if ((Objects.equals(but_3.getText(), but_6.getText())) && (Objects.equals(but_6.getText(), but_9.getText()))){
            if (Objects.equals(but_9.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_9.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        if ((Objects.equals(but_7.getText(), but_8.getText())) && (Objects.equals(but_8.getText(), but_9.getText()))){
            if (Objects.equals(but_9.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_9.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        if ((Objects.equals(but_1.getText(), but_4.getText())) && (Objects.equals(but_4.getText(), but_7.getText()))){
            if (Objects.equals(but_7.getText(), "x")){
                winner_is.setText("X is the Winner!");
            }
            if (Objects.equals(but_7.getText(), "o")){
                winner_is.setText("O is the Winner!");
            }
        }
        else{
            if (turn == 9){
                winner_is.setText("Draw");
            }
        }

    }


    @FXML
    void on_b1() {
        if (Objects.equals(but_1.getText(), "")){
            if (turn%2 == 0){
                but_1.setText("x");
            }
            else{
                but_1.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }

    @FXML
    void on_b2() {
        if (Objects.equals(but_2.getText(), "")){
            if (turn%2 == 0){
                but_2.setText("x");
            }
            else{
                but_2.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }

    @FXML
    void on_b3() {
        if (Objects.equals(but_3.getText(), "")){
            if (turn%2 == 0){
                but_3.setText("x");
            }
            else{
                but_3.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }

    @FXML
    void on_b4() {
        if (Objects.equals(but_4.getText(), "")){
            if (turn%2 == 0){
                but_4.setText("x");
            }
            else{
                but_4.setText("o");
            }
            turn+=1;
            how_to_win();

        }
    }

    @FXML
    void on_b5() {
        if (Objects.equals(but_5.getText(), "")){
            if (turn%2 == 0){
                but_5.setText("x");
            }
            else{
                but_5.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }

    @FXML
    void on_b6() {
        if (Objects.equals(but_6.getText(), "")){
            if (turn%2 == 0){
                but_6.setText("x");
            }
            else{
                but_6.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }

    @FXML
    void on_b7() {
        if (Objects.equals(but_7.getText(), "")){
            if (turn%2 == 0){
                but_7.setText("x");
            }
            else{
                but_7.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }

    @FXML
    void on_b8() {
        if (Objects.equals(but_8.getText(), "")){
            if (turn%2 == 0){
                but_8.setText("x");
            }
            else{
                but_8.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }


    @FXML
    void on_b9() {
        if (Objects.equals(but_9.getText(), "")){
            if (turn%2 == 0){
                but_9.setText("x");
            }
            else{
                but_9.setText("o");
            }
            turn+=1;
            how_to_win();
        }
    }
}