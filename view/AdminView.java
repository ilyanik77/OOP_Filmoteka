package view;

import java.util.Scanner;

public class AdminView {
    
    public int showAdminMenu(){
        System.out.println("1 - Добавить фильм");
        System.out.println("2 - Редактировать описание");
        System.out.println("3 - Удалить фильм");
        System.out.println("4 - Проверить заявки на аренду");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        return num;
    }
    
    

}
