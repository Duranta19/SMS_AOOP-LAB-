package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class BGUpdateCon {

    @FXML
    private TextField srcL;

    @FXML
    private TextField uage;

    @FXML
    private TextField ucls;

    @FXML
    private DatePicker udob;

    @FXML
    private TextField uid;

    @FXML
    private TextField uname;

    @FXML
    String getDoB(ActionEvent event) {
        LocalDate date = udob.getValue();
        String getdate = date.toString();
        return getdate;
    }

    ArrayList<Students> list = new ArrayList<>();
    String srcID = srcL.getText();
    @FXML
    void search(ActionEvent event) {

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
            //System.out.println(sInfo());
            String x = s.getId();
            if(x.equals(srcID)){
                uname.setText(s.getName());
                uid.setText(s.getId());
                uage.setText(s.getAge());
                ucls.setText(s.getCls());
            }
        }
    }

    @FXML
    void update(ActionEvent event) {

    }

}
