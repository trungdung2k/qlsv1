/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv.Faculty;

/**
 *
 * @author minhd
 */
public class Faculty {
    int id;
    String name , code;

    public Faculty() {
    }

    public Faculty(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Faculty(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
