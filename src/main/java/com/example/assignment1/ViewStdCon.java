package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ViewStdCon {

    @FXML
    private Label lAge;

    @FXML
    private Label lCls;

    @FXML
    private Label lDob;

    @FXML
    private Label lMath;

    @FXML
    private Label lName;

    @FXML
    private Label lScience;

    @FXML
    private Label leng;

    @FXML
    private Label lgrd;

    @FXML
    private Label lid;

    @FXML
    private TextField sInfo;

    @FXML
    private Button src;



    ArrayList<Students> list = new ArrayList<>();

    @FXML
    public String sInfo() {
        String stdInfo = sInfo.getText();
        return stdInfo;
    }

    @FXML
    void src(ActionEvent event) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("E:\\Study\\6th Trimester\\A_OOP\\ass\\src\\main\\resources\\com\\example\\assignment1\\data.txt"));
            String str;
            while ((str = br.readLine()) != null){
                String [] stng = str.split(" ");
                String a,b,c,d,e,f,g,h, i;
                a = stng[0];
                b = stng[1];
                c = stng[2];
                d = stng[3];
                e = stng[4];
                f = stng[5];
                g = stng[6];
                h = stng[7];
                Students st1 = new Students(a,b,c,d,e,f,g,h);
                list.add(st1);
            }
            br.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        for(Students s : list){
            System.out.println(s.getName()+ " "+s.getId());
            System.out.println(sInfo());
            String x = s.getId();
            if(x.equals(sInfo())){
                lName.setText(s.getName());
                lid.setText(s.getId());
                lAge.setText(s.getAge());
                lDob.setText(s.getDob());
                lCls.setText(s.getCls());
                lMath.setText(s.getMathMarks());
                lScience.setText(s.getScienceMarks());
                leng.setText(s.getEnglishMarks());
            }
            else{
                lName.setText("Not Found");
            }
        }
    }

}
