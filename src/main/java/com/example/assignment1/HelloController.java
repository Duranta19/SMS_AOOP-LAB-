package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button login;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField uname;

    @FXML
    void login(ActionEvent event) {
        if((uname.getText()).equals("admin") && (pass.getText()).equals("admin")){
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
                Parent root;
                root = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Home");
                stage.show();

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            Alert alret = new Alert(Alert.AlertType.ERROR);
            alret.setTitle("Wrong Password");
            alret.setContentText("User name : admin"+"\n"+ "Password : admin");
            alret.show();
        }
    }

}
