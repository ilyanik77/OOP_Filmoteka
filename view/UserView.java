package view;

import java.util.Scanner;

public class UserView {

    Scanner sc = new Scanner(System.in);
    
    public void showUserMenu(){
        System.out.println("1 - Арендовать фильм");
        System.out.println("2 - Вернуть фильм");
        System.out.println("9 - Выход");
        
    }


}
