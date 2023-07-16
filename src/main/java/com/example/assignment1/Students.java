package com.example.assignment1;

public class Students {
    private String name;
    private String id;
    private String age;
    private String cls;
    private String dob;
    private String mathMarks;
    private String scienceMarks;
    private String englishMarks;
    private String grd;
    public Students(String name, String id, String age,  String dob, String cls, String mathMarks, String scienceMarks, String englishMarks){
        this.name = name;
        this.id = id;
        this.age = age;
        this.cls = cls;
        this.dob = dob;
        this.mathMarks =mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

//    public Students(String name, String id, String age, String dob, String cls, String mathMarks, String scienceMarks, String englishMarks, String grd){
//        this.name = name;
//        this.id = id;
//        this.age = age;
//        this.cls = cls;
//        this.dob = dob;
//        this.mathMarks =mathMarks;
//        this.scienceMarks = scienceMarks;
//        this.englishMarks = englishMarks;
//        this.grd = grd;
//    }

    public String getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(String mathMarks) {
        this.mathMarks = mathMarks;
    }

    public String getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(String scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public String getGrd() {
        return grd;
    }

    public String getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(String englishMarks) {
        this.englishMarks = englishMarks;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getCls() {
        return cls;
    }

    public String getDob() {
        return dob;
    }
}
