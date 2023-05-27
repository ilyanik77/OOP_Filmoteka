package view;

import java.util.Scanner;

public class InputData {

    public String inputName() {

        Scanner sc = new Scanner(System.in);
        String name = null;
        try {
            System.out.print("Введите имя пользователя: ");
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("");
        } finally {
            sc.close();
        }
        return name;
        
    }

    public String inputRole() {

        Scanner sc = new Scanner(System.in);
        String role = null;
        try {
            System.out.print("Введите роль: ");
            role = sc.nextLine();
        } catch (Exception e) {
            System.out.println("");
        } finally {
            sc.close();
        }
        return role;
        
    }

    public Double inputBalance() {

        Scanner sc = new Scanner(System.in);
        Double balance = null;
        try {
            System.out.print("Баланс пользователя: ");
            balance = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("");
        } finally {
            sc.close();
        }
        return balance;
        
    }

    public Integer countFilms() {

        Scanner sc = new Scanner(System.in);
        Integer countFilms = null;
        try {
            System.out.print("Кол-во фильмов: ");
            countFilms = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("");
        } finally {
            sc.close();
        }
        return countFilms;
        
    }

    public String inputFilmName() {

        Scanner sc = new Scanner(System.in);
        String name = null;
        try {
            System.out.print("Введите название фильма: ");
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("");
        } finally {
            sc.close();
        }
        return name;

    }

    public String inputYearRelease() {

        Scanner sc = new Scanner(System.in);
        String yearRelease = null;
        try {
            System.out.print("Введите год релиза: ");
            yearRelease = sc.nextLine();
        } catch (Exception e) {
            System.out.println("");
        } finally {
            sc.close();
        }
        return yearRelease;

    }

    public Double inputPriceFilm() {

        Scanner sc = new Scanner(System.in);
        Double priceFilm = null;
        try {
            System.out.print("Цена фильма: ");
            priceFilm = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("");
        } finally {
            sc.close();
        }
        return priceFilm;

    }

    
    
}
