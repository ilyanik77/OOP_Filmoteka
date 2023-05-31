
//import model.ListMovies;
//import model.Movie;
//import model.User;
import java.io.IOException;
//import view.Authorize;
//import view.AdminView;
//import view.UserView;
//import model.ListUsers;

import services.App;


public class Main {
    
    public static void main(String[] args) throws IOException {

        //ListMovies listMovies = new ListMovies("Список фильмов", "dbMovies.csv");
        //ListUsers listUsers = new ListUsers("Список пользователей", "dbUsers.csv");
        //AdminView adminView = new AdminView();
        //UserView userView = new UserView();
        //Authorize authorize = new Authorize();
        App app = new App();
        
    
        //listMovies.addMovieInList();
        //System.out.println(listMovies.printListMovies());
        //listUsers.addUserInList(User.getNewUser());
        //System.out.println(listUsers.printListUsers());
        //listUsers.writeUserInFile();
        //System.out.println(listUsers.printDbUsers());
        //listMovies.writeMovieInFile();
        //listUsers.writeUserInFile();
        //listMovies.printDbMovies();
        //listUsers.printDbUsers();
    
        //listMovies.deleteMovieByName();
        //listMovies.printDbMovies();
        //listUsers.deleteUserByName();
        //listUsers.printDbUsers();
        //System.out.println(adminView.showAdminMenu());
        //System.out.println(userView.showUserMenu());
        //System.out.println(authorize.authorize());
        //String name = authorize.authorize();
        //System.out.println(app.getNumMenu());
        app.showMenu();
        //app.checkUser();


    }


    
}
