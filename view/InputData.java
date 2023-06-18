package view;

//import java.nio.charset.Charset;
import java.util.Scanner;

public class InputData {

    Scanner sc = new Scanner(System.in);

    public String inputName() {

        String name = "";
        try {
            System.out.print("Введите имя пользователя: ");
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return name;
        
    }

    public String inputRole() {

        String role = "";
        try {
            System.out.print("Введите роль: ");
            role = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return role;
        
    }

    public Double inputBalance() {

        Double balance = 0.0;
        try {
            
            System.out.print("Баланс пользователя: ");
            balance = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return balance;
        
    }

    public Integer countFilms() {

        Integer countFilms = 0;
        try {
            System.out.print("Кол-во фильмов: ");
            countFilms = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return countFilms;
        
    }

    public String inputFilmName() {

        String name = "";
        try {
            System.out.print("Введите название фильма: ");
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return name;

    }

    public String inputYearRelease() {

        String yearRelease = "";
        try {
            System.out.print("Введите год релиза: ");
            yearRelease = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return yearRelease;

    }

    public Double inputPriceFilm() {

        Double priceFilm = 0.0;
        try {
            System.out.print("Цена фильма: ");
            priceFilm = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return priceFilm;

    }

    public Integer choiceItem () {

        Integer res = 0;
        try {
            System.out.print("Выберите пункт: ");
            res = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return res;
    }

    
    
}
