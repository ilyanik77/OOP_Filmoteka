package view;

import java.util.Scanner;

public class Authorize {

    public String authorize() {

        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name =  sc.nextLine();
        sc.close();

        return name;
    }
}
