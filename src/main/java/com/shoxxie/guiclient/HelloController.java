package com.shoxxie.guiclient;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.PrimitiveIterator;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    @FXML
    private Button button;

    @FXML
    private ListView<String> listView;

    private Server server;

    @FXML
    private void initialize(){
        button.setOnAction(event -> {
            String message = textField.getText();
            if(!message.isEmpty()){
                textArea.appendText(message + "\n");
                textField.clear();
            }
        });

        textField.setOnKeyPressed(keyEvent -> handleKeyPress(keyEvent));
    }

    @FXML
    private void handleKeyPress(KeyEvent keyEvent){
        if(keyEvent.getCode() == KeyCode.ENTER){
            String message = textField.getText();
            if(!message.isEmpty()){
                textArea.appendText(message + "\n");
                textField.clear();
            }
        }
    }

    @FXML
    private void handleSendButton() {
        String message = textField.getText();
        if (!message.isEmpty()) {
            textArea.appendText(message + "\n");
            textField.clear();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try{
            server = new Server(new ServerSocket(1234));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error creating server");
        }
    }
}