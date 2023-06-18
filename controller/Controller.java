package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import services.App;
import view.Authorize;


public class Controller {

    Authorize au = new Authorize();
    App app = new App();
    Scanner sc = new Scanner(System.in);

    public void run() throws IOException {

        au.welcome();

        String name =  au.authorize();
        
        File file = new File("dbUsers.csv");
        String line = "";
        String role = "admin";
        
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)) {
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
            if (num == 1) {
                System.out.println("Здравствуйте, admin.");
                app.appAdmin();


            } else if (num == 2) {
                System.out.println("Здравствуйте, user.");
                app.appUser();

                 
            } else {
                 System.out.println("Такого пользователя нет.");
            }
            
        }

        
         
    }
    
    

}
