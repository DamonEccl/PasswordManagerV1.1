package org.example;

public class New {

    public New(){

    }

    String password;
    String name;
    String user;

    public New(String password, String name, String user){
        this.password = password;
        this.name = name;
        this.user = name;
    }

    public void Create(String pass, String nam, String userName){
        this.password = pass;
        this.name = nam;
        this.user = userName;

        InsertNewPass();
    }

    public void InsertNewPass(){

    }




}
