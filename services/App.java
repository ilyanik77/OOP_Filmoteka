package services;

import model.ListMovies;
import model.ListUsers;
import view.AdminView;
import view.InputData;
import view.UserView;

public class App {

    ListMovies lm = new ListMovies("list of Films", "dbMovies.csv");
    ListUsers lu = new ListUsers("list of Users", "dbUsers.csv");

    public void appAdmin() {

        Integer res = 0;
        new AdminView().showAdminMenu();
        res = new InputData().choiceItem(); 

        switch (res) {
            case (1):
                System.out.println(" Хочу взять фильм. ");
                
                break;

            case (2):
                System.out.println(" Хочу сдать фильм. ");
            
                break;

            case (3):
                System.out.println("Ваш выбор: добавить фильм.");
                lm.writeMovieInFile();
            
                break;

            case (4):
                System.out.println("Ваш выбор: удалить фильм.");
                lm.deleteMovieByName();
            
                break;

            case (5):
                System.out.println("Ваш выбор: добавить пльзователя.");
                lu.writeUserInFile();
            
                break;

            case (6):
                System.out.println("Ваш выбор: удалить пользователя.");
                lu.deleteUserByName();
            
                break;

            case (9):
                System.out.println("Выход \n До свидания!");
                break;

            default:
                System.out.println("Такого пункта нет.");
                System.out.println("Повторите Ваш выбор");
                appAdmin();

        }

    }

    public void appUser() {

        Integer res = 0;
        new UserView().showUserMenu();
        res = new InputData().choiceItem();

        switch (res) {
            case (1):
                System.out.println(" Хочу взять фильм. ");
                
                break;

            case (2):
                System.out.println(" Хочу сдать фильм. ");
            
                break;

            case (9):
                System.out.println("Выход");
                break;

            default:
                System.out.println("Такого пункта нет.");
                System.out.println("Повторите Ваш выбор");
                appUser();
        }                
    }
}

    

    

