package view;

import java.io.IOException;
import java.util.Scanner;

public class Authorize {

    Scanner sc = new Scanner(System.in);
    

    public void welcome() {
        System.out.println("Добро пожаловать!");
    }


    public String authorize() throws IOException {

        String name = "";
        try {
            
            System.out.print("Введите Ваше имя: ");
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Некоректный ввод данных.");
        } 
        return name;

    }
}
