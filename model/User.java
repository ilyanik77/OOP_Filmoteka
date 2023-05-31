package model;

import view.InputData;

public class User {

    public String name;
    public String role;
    public Double balance;
    public Integer countFilms;

    public User(String name, String role, Double balance, Integer countFilms) {
        this.name = name;
        this.role = role;
        this.balance = balance;
        this.countFilms = countFilms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getCountFilms() {
        return countFilms;
    }

    public void setCountFilms(Integer countFilms) {
        this.countFilms = countFilms;
    }

    public String toString() {
        return name + ";" + role + ";" + balance + ";" + countFilms + "\n";

    }

    public static User getNewUser() {

        String name =  new InputData().inputName();
        String role =  new InputData().inputRole();
        Integer countFilms = new InputData().countFilms();
        Double balance = new InputData().inputBalance();
        
        return new User(name, role, balance, countFilms);

    }

    

}