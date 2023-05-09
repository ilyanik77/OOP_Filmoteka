package view;

import java.util.Scanner;

public class UserView {
    
    public int showUserMenu(){
        System.out.println("1 - Подать заявку на фильм");
        System.out.println("2 - Вернуть фильм");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        return num;
    }


}
