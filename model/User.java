package model;


public class User {

    private String name;
    private String role;
    private Double balance;
    private Integer countFilms;

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
        return "Пользователь :" + name + "; Амплуа :" + role + "; Ваш баланс :" + balance + "; Кол-во фильмов :" + countFilms;

    }

}