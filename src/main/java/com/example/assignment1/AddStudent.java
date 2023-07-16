package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AddStudent {

    @FXML
    private Button add;

    @FXML
    private TextField sAge;

    @FXML
    private TextField sClass;

    @FXML
    private DatePicker sDoB;

    @FXML
    private TextField sID;

    @FXML
    private TextField sName;

    ArrayList<Students> li = new ArrayList<>();

    String mathMarks = null;
    String scienceMarks = null;
    String englishMarks = null;
    String gread = null;

    @FXML
    void add(ActionEvent event){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\ass\\src\\main\\resources\\com\\example\\assignment1\\data.txt", true));
            li.add( new Students(sName.getText(),sID.getText(),sAge.getText(),sClass.getText(),getDOB(),mathMarks,scienceMarks,englishMarks));
//            br.write(sName.getText()+" "+sID.getText()+ " "+ sAge.getText() +" "+ sClass.getText()+ " "+ getDOB()+ " "+ mathMarks+" "+scienceMarks+" "+englishMarks);
//            br.newLine();
//            br.close();
            for(Students st : li){
                bw.write(st.getName()+ " "+st.getId()+ " "+st.getAge()+ " "+st.getDob()+ " "+st.getCls()+" "+ st.getMathMarks()+" "+st.getScienceMarks()+ " "+st.getEnglishMarks() + " "+ gread);
                bw.newLine();
                bw.close();
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public String getDOB() {
        LocalDate date = sDoB.getValue();
        String getDate = date.toString();
        return getDate;
    }

}

