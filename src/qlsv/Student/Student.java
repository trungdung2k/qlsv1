/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv.Student;

/**
 *
 * @author minhd
 */
public class Student {
    int id;
    String fullname, msv, gender, phone , address, email;
    int age;

    public Student() {
    }

    public Student(int id, String fullname, String msv, String gender, String phone, String address, String email, int age) {
        this.id = id;
        this.fullname = fullname;
        this.msv = msv;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public Student(String fullname, String msv, String gender, String phone, String address, String email, int age) {
        this.fullname = fullname;
        this.msv = msv;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.age = age;
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    
}
