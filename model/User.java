package model;


public class User {

    private String name;
    private String role;
    private Double balance;
    private int countFilms;

    public User(String name, String role, Double balance, int countFilms) {
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

    public int getCountFilms() {
        return countFilms;
    }

    public void setCountFilms(int countFilms) {
        this.countFilms = countFilms;
    }

}