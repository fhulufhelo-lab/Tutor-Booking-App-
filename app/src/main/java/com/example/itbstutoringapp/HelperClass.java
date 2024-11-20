package com.example.itbstutoringapp;

public class HelperClass {

    String name,surname,email,username,studentnumber,password;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String email) {

        this.surname = surname;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String username) {

        this.email = email;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = surname;
    }

    public String getStudentnumber() {

        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {

        this.studentnumber = studentnumber;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public HelperClass(String name, String surname, String email, String username, String studentnumber, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.studentnumber = studentnumber;
        this.password = password;
    }

    public HelperClass() {
    }
}
