package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private Button nStd;

    @FXML
    private Button upInfo;

    @FXML
    private Button vInfo;

    @FXML
    void newStudent(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddStudent.fxml"));
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

    @FXML
    void UpdateInfo(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BGUpdate.fxml"));
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

    @FXML
    void viewInfo(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewStd.fxml"));
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

}
