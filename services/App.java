package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.View;

import view.AdminView;
import view.Authorize;
//import view.InputData;
import view.UserView;

public class App {

    Scanner sc = new Scanner(System.in);

    public Integer getNumMenu() throws IOException {
        String name =  new Authorize().authorize();
        
        File file = new File("dbUsers.csv");
        String line = "";
        String role = "admin";
        
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); 
        int num = 0;   
        while ((line = br.readLine()) != null) {
               
            String[] x = line.split(";"); 
            for (String item : x) {
                if(x[0].equals(name)) {
                    if(x[1].equals(role)) {
                        num = 1;
                    } else num = 2;
                    
                } 
            }
        }
        return num;    
        
         
    }

    public void showMenu() throws IOException {


        Integer num = new App().getNumMenu();

        if (num == 1) {
            System.out.println("Здравствуйте, admin. \n Выберите пункт:");
            new AdminView().showAdminMenu();
        } else if (num == 2) {
            System.out.println("Здравствуйте, user. \n Выберите пункт:");
            new UserView().showUserMenu();
        } else {
            System.out.println("Такого пользователя нет.");
        } 

        
    }

    // public void run() {
    //     int num = checkUser();
    //     switch (num) {
    //         case (1):
                
    //             break;
    //         case (2):
                
    //             break;
    //         case (3):
                
    //             break;
    //         case (9):
                
    //             break;
    //         default:
    //             System.out.println("Команда не распознанна попробуйте еще раз");
    //             run();
            
    //     }
    // }

    
}
