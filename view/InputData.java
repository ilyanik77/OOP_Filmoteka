package view;

import java.util.Scanner;

public class InputData {

    public String inputName() {

        System.out.print("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name =  sc.nextLine();
        
        return name;
    }

    public String inputRole() {

        System.out.print("Введите роль: ");
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();

        return role;
    }

    public Double inputBalance() {

        System.out.print("Ваш баланс: ");
        Scanner sc = new Scanner(System.in);
        Double balance = Double.parseDouble(sc.nextLine());

        return balance;
    }

    public Integer countFilms() {

        System.out.print("Кол-во фильмов: ");
        Scanner sc = new Scanner(System.in);
        Integer countFilms = Integer.parseInt(sc.nextLine());

        return countFilms;
    }

    public String inputFilmName() {

        System.out.print("Введите название фильма: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        return name;
    }

    public String inputYearRelease() {

        System.out.print("Введите год релиза: ");
        Scanner sc = new Scanner(System.in);
        String yearRelease = sc.nextLine();

        return yearRelease;
    }

    public Double inputPriceFilm() {

        System.out.print("Цена фильма: ");
        Scanner sc = new Scanner(System.in);
        Double priceFilm = Double.parseDouble(sc.nextLine());

        return priceFilm;
    }
    
}
