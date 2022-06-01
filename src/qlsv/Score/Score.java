/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv.Score;

/**
 *
 * @author minhd
 */
public class Score {
    int id;
    String namestudent , namesubject , cc , gk , kt , xl  ;

    public Score() {
    }

    public Score(int id, String namestudent, String namesubject, String cc, String gk, String kt, String xl) {
        this.id = id;
        this.namestudent = namestudent;
        this.namesubject = namesubject;
        this.cc = cc;
        this.gk = gk;
        this.kt = kt;
        this.xl = xl;
    }

    public Score(String namestudent, String namesubject, String cc, String gk, String kt, String xl) {
        this.namestudent = namestudent;
        this.namesubject = namesubject;
        this.cc = cc;
        this.gk = gk;
        this.kt = kt;
        this.xl = xl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamestudent() {
        return namestudent;
    }

    public void setNamestudent(String namestudent) {
        this.namestudent = namestudent;
    }

    public String getNamesubject() {
        return namesubject;
    }

    public void setNamesubject(String namesubject) {
        this.namesubject = namesubject;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getGk() {
        return gk;
    }

    public void setGk(String gk) {
        this.gk = gk;
    }

    public String getKt() {
        return kt;
    }

    public void setKt(String kt) {
        this.kt = kt;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }
   
    
}
