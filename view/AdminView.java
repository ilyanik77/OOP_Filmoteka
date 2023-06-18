package view;

import java.util.Scanner;

public class AdminView {

    Scanner sc = new Scanner(System.in);
    
    public void showAdminMenu(){
        System.out.println("1 - Арендовать фильм");
        System.out.println("2 - Вернуть фильм");
        System.out.println("3 - Добавить фильм");
        System.out.println("4 - Удалить фильм");
        System.out.println("5 - Добавить пользователя");
        System.out.println("6 - Удалить пользователя");
        System.out.println("9 - Выход");
    }
    

}
