package view;

import java.io.IOException;
import java.util.Scanner;

public class Authorize {

    Scanner sc = new Scanner(System.in);

    public String authorize() throws IOException {

        String name = "";
        try {
            System.out.println("Добро пожаловать!");
            System.out.print("Введите Ваше имя: ");
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return name;

    }
}
